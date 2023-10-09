import java.util.Scanner;

class Factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter an integer greater than zero: ");
    int inputNum = input.nextInt();
    
    int factor = 1;
    
    for (int i = 2; i <= inputNum; i++) {
      factor *= i;
    }
    System.out.printf("The factorial of %d is %d", inputNum, factor);
  }
}