package TicTacToe;

public class Board {
  Mark[] boardArray = new Mark[] {Mark.EMPTY, Mark.EMPTY, Mark.EMPTY, Mark.EMPTY, Mark.EMPTY, Mark.EMPTY, Mark.EMPTY, Mark.EMPTY, Mark.EMPTY, Mark.EMPTY};

  int[][] winConditions = new int[][] {{1, 2, 3}, {1, 5, 9}};

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder(); //use String builder
    for (int i = 1; i <= 9; i++) {

      output.append(String.format("pos: %d = %s , ", i, boardArray[i].toString()));
    }
    return output.toString();
  }

  public void setMark(int pos, Mark mark) throws impossibleMoveExeption {
    if (boardArray[pos] != mark.EMPTY) throw new impossibleMoveExeption();
    boardArray[pos] = mark;
  }

  public Mark hasWinner() {
    for (int[] winConditionArray: winConditions) {
      if (boardArray[winConditionArray[0]] == boardArray[winConditionArray[1]] && boardArray[winConditionArray[0]] == boardArray[winConditionArray[2]]) {
        return boardArray[winConditionArray[0]];
      }
    }

    return Mark.EMPTY;
  }
}
