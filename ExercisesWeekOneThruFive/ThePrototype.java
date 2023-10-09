import java.util.Scanner;

class ThePrototype extends TextMethods {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    GreenText();
    System.out.print("Airship pilot, enter a distance between 0 and 100: ");
    
    int pilotInput = 0;
    boolean viableRange = false;
    
    do {
      YellowText();
      pilotInput = userInput.nextInt();
      ResetText();
      if (pilotInput <= 100 && pilotInput >= 0) {
        viableRange = true;
      } else {
        viableRange = false;
        RedText();
        System.out.println("Try again.");
        ResetText();
      }
    } while (!viableRange);
    
    ClearScreen();
    
    GreenText();
    System.out.println("Hunter, it's up to you now to get the range right.");
    ResetText();
    
    int hunterInput = 0;
    boolean rangeCorrect = false;

    do {
      System.out.print("\nWhat's your guess? ");
      CyanText();
      hunterInput = userInput.nextInt();
      RedText();
      if (hunterInput == pilotInput) {
        GreenText();
        System.out.println("Correct! That would be a direct hit.");
        rangeCorrect = true;
      } else if (hunterInput >= pilotInput) {
        System.out.println(hunterInput + ", The airship is closer than that! Try again.");
      } else {
        System.out.println(hunterInput + ", The airship is further than that! Try again.");
      }
      ResetText();
    } while (!rangeCorrect);
  }
}