import java.util.Scanner;

class IsPrime {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer ");
    int numToCheck = input.nextInt();
    
    int primeCheck = 0;
    
    for (int i = 2; i < numToCheck; i++) {
      if (numToCheck % i == 0) {
        primeCheck++;
      }
    }
    if (primeCheck >= 2) {
      System.out.println(numToCheck + " is not a prime number.");
    } else {
      System.out.println(numToCheck + " is a prime number");
    }
  }
}