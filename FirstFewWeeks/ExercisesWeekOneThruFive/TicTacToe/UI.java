package TicTacToe;

import java.util.Scanner;

public class UI {
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
//    System.out.println("Welcome first player enter your name: ");
//    String player1 = input.nextLine();
//
//    System.out.println("Alright, second player enter your name: ");
//    String player2 = input.nextLine();
//
//    System.out.println("The game is played as such: players take turns choosing a square using the numpad as positions. First to 3 in a row wins.");

    Board board = new Board();

    System.out.println(board);

    try {
      board.setMark(1, Mark.X);
    } catch (impossibleMoveExeption e) {
      System.out.println("impossible move try again.");
    };

    try {
      board.setMark(5, Mark.X);
    } catch (impossibleMoveExeption e) {
      System.out.println("impossible move try again.");
    };

    System.out.println(board);

    try {
      board.setMark(9, Mark.X);
    } catch (impossibleMoveExeption e) {
      System.out.println("impossible move try again.");
    };

    System.out.println(board.hasWinner());



//    while (!finishRequirements) {
//      if (boardFull || winCondition) finishRequirements && print win statement;
//
//      turn player1: choose position if !position give warning and try again
//        turn over;
//
//      turn player2: choose position if !position give warning and try again
//        turn over;
//    }

  }
}
