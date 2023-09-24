import java.util.Scanner;

class ExerciseTwelve {
  public static void main(String[] args) {
    int number;
    Scanner input = new Scanner(System.in);
    System.out.println("Number?");
    number = input.nextInt();
    if (number % 2 == 0) { 
      System.out.println("Tick");
    } else {
      System.out.println("Tock");
    }
  }
}