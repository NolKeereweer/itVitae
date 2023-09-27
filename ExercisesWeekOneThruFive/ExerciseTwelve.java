import java.util.Scanner;

class ExerciseTwelve {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Number?");
    int number = input.nextInt();
    if (number % 2 == 0) { 
      System.out.println("Tick");
    } else {
      System.out.println("Tock");
    }
  }
}