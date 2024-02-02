import java.util.Scanner;
import ExercisesWeekOneThruFive.TextMethods;

class TakingANumber {
  private static Scanner input = new Scanner(System.in);
  
  private static int askForNumber(String displayText) {
    System.out.println(displayText);
    int response = input.nextInt();
    return response;
  }
  
  private static int askForNumberInRange(String displayText, int min, int max) {
    int response = 0;
    boolean viableResponse = false;
    do {
      System.out.println(displayText);
      response = input.nextInt();

      if (response >= min && response <= max) {
        viableResponse = true;
        
      } else {
        TextMethods.redText();
        System.out.println("Input out of range. Try Again.");
        TextMethods.resetText();
        viableResponse = false;
      }
    } while (!viableResponse);
    
    if (viableResponse) return response;
    else return 0;
  }
}