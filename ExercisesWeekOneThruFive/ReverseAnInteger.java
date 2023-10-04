import java.util.Scanner;

class ReverseAnInteger {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer");
    String toBeReversed = String.valueOf(input.nextInt());
    // Asked for an integer input. Immediatly turn that into a String.
    
    StringBuilder stringBuilder = new StringBuilder(toBeReversed);
    // Create a StringBuilder from the int-to-String variable.
    
    // StringBuilders are easy to reverse as you can see below.
    System.out.println(stringBuilder.reverse());
  }
}