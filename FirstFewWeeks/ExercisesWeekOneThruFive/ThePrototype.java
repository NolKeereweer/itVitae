import java.util.Scanner;
import ExercisesWeekOneThruFive.TextMethods;

class ThePrototype {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    TextMethods.greenText();
    System.out.print("Airship pilot, enter a distance between 0 and 100: ");
    
    int pilotInput = 0;
    boolean viableRange = false;
    
    do {
      TextMethods.yellowText();
      pilotInput = userInput.nextInt();
      TextMethods.resetText();
      if (pilotInput <= 100 && pilotInput >= 0) {
        viableRange = true;
      } else {
        viableRange = false;
        TextMethods.redText();
        System.out.println("Try again.");
        TextMethods.resetText();
      }
    } while (!viableRange);
    
    TextMethods.clearScreen();
    
    TextMethods.greenText();
    System.out.println("Hunter, it's up to you now to get the range right.");
    TextMethods.resetText();
    
    int hunterInput = 0;
    boolean rangeCorrect = false;

    do {
      System.out.print("\nWhat's your guess? ");
      TextMethods.cyanText();
      hunterInput = userInput.nextInt();
      TextMethods.redText();
      if (hunterInput == pilotInput) {
        TextMethods.greenText();
        System.out.println("Correct! That would be a direct hit.");
        rangeCorrect = true;
      } else if (hunterInput >= pilotInput) {
        System.out.println(hunterInput + ", The airship is closer than that! Try again.");
      } else {
        System.out.println(hunterInput + ", The airship is further than that! Try again.");
      }
      TextMethods.resetText();
    } while (!rangeCorrect);
  }
}