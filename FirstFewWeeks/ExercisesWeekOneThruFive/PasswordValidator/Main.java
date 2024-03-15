package PasswordValidator;

import java.util.Scanner;

public class Main {
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    PasswordValidator p = new SecondPasswordValidator();

    while (true) {
      System.out.println("Please enter a password so it can be validated:");
      String password = input.nextLine();

      if (p.isValid(password)) {
        System.out.println("Valid password.");
      } else {
        System.out.println("Invalid password. Try again.");
      }
    }
  }
}
