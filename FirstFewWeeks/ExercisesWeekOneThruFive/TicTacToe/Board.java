package TicTacToe;

public class Board {
  Mark[] boardArray = new Mark[] {Mark.EMPTY, Mark.EMPTY, Mark.EMPTY, Mark.EMPTY, Mark.EMPTY, Mark.EMPTY, Mark.EMPTY, Mark.EMPTY, Mark.EMPTY, Mark.EMPTY};

  int[][] winConditions = new int[][] {{1, 2, 3}, {1, 5, 9}, {1, 4, 7}, {2, 5, 8}, {3, 5, 7}, {3, 6, 9}, {4, 5, 6}, {7, 8, 9}};

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder(); //use String builder
    for (int i = 1; i <= 9; i++) {
      output.append(String.format("pos: %d = %s , ", i, boardArray[i].toString()));
    }
    return output.toString();
  }

  public void setMark(int pos, Mark mark) throws impossibleMoveException {
    if (pos >= 11) throw new impossibleMoveException();
    if (boardArray[pos] != mark.EMPTY) throw new impossibleMoveException();
    boardArray[pos] = mark;
  }

  public Mark winner() {
    for (int[] winConditionArray: winConditions) {
      if (boardArray[winConditionArray[0]] == boardArray[winConditionArray[1]] && boardArray[winConditionArray[0]] == boardArray[winConditionArray[2]]) {
        return boardArray[winConditionArray[0]];
      }
    }
    return Mark.EMPTY;
  }

  public boolean hasWinner() {
    return winner() != Mark.EMPTY;
  }

  private boolean full() {
    for (int i = 1; i < 10; i++) {
      if (boardArray[i] == Mark.EMPTY) {
        return false;
      }
    }
    return true;
  }

  public boolean done() {
    return full() || hasWinner();
  }
}
