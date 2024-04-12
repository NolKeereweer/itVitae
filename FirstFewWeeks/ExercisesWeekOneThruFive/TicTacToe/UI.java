package TicTacToe;

import java.util.Scanner;

public class UI {
  private static Scanner input = new Scanner(System.in);

  static Player p1 = new Player("Nol", Mark.X);
  static Player p2 = new Player("Mark", Mark.O);
  static Player current = p1;

  static Board board = new Board();

  public static void main(String[] args) {
//    System.out.println("Welcome first player enter your name: ");
//    String player1 = input.nextLine();
//
//    System.out.println("Alright, second player enter your name: ");
//    String player2 = input.nextLine();
//
//    System.out.println("The game is played as such: players take turns choosing a square using the numpad as positions. First to 3 in a row wins.");

    System.out.println(board);

    while (!board.done()) { // TODO implement new board booleans, check outside of loop
      turn(board, current);

      if (board.winner() == current.mark ) {
        System.out.println("Congratulations player " + current.name + " has won!");
        return;
      }

      switchCurrentPlayer();
    }
  }

  public static void switchCurrentPlayer() {
    if (current == p1) {
      current = p2;
    } else {
      current = p1;
    }
  }

  public static void turn(Board board, Player current) { // move to separate Game class
    boolean turnState = true;
    do {
      System.out.println("Player " + current.name + " enter a number for which position you want to put your mark");
      int pos = input.nextInt();

      try {
        board.setMark(pos, current.mark);
        turnState = false;
      } catch (impossibleMoveException e) {
        System.out.println(board);
        System.out.println("impossible move try again.");
      }
    } while (turnState);
    System.out.println(board);
  }
}
