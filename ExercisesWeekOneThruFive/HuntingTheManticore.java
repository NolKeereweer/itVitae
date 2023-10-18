import java.util.Scanner;

class HuntingTheManticore {
  
  private static Scanner input = new Scanner(System.in);
  private static boolean gameOn = true;
  private static int turnNum = 1;
  private static int cityHealth = 15;
  private static int manticoreHealth = 10;
  private static int manticoreDistance = 1;
  
  public static void main(String[] args) {
    System.out.println();
    System.out.println("The Manticore, The " + redText("Uncoded") + " one's airship, is attacking the city of Consolas.");
    System.out.println("\nPlayer one, " + yellowText("The Pilot") + ", gets to determine the distance at which The Manticore will attack.");
    System.out.println("Player two, " + cyanText("The Defender") + ", gets to defend the city of Consolas with a magic cannon.");
    
    manticoreTurn();
    
    TextMethods.clearScreen();
    
    cityDefenderTurn();
    
    System.out.println();
  }
  
  // Asking for the players input, retrying if the number is outside of the range
  private static void manticoreTurn() {
    System.out.print("Pilot enter your distance: ");
    
    int manticorePilotInput = 0;
    boolean viableRange = false;    
    do {
      TextMethods.yellowText();
      manticorePilotInput = input.nextInt();
      TextMethods.resetText();
      if (manticorePilotInput <= 100 && manticorePilotInput >= 1) {
        manticoreDistance = manticorePilotInput;
        viableRange = true;
      } else {
        viableRange = false;
        TextMethods.redText();
        System.out.println("Number is not within the game's range. Try again.");
        TextMethods.resetText();
      }
    } while (!viableRange);
  }
  
  private static void cityDefenderTurn() {
    int cityDefenderInput = 0;
    
    do {
      if (!gameOn) {
        break; // to make sure the program stops when it needs to
      }
      System.out.println("----------------------------------------------------------------");
      System.out.println("Round: " + turnNum + " City: " + cityHealth + "/15 Manticore: " + manticoreHealth + "/10");
      System.out.println("The cannon should do " + cannonDamage(turnNum) + " damage this round.");
      System.out.print("\nDefender, enter range: ");
      TextMethods.cyanText();
      cityDefenderInput = input.nextInt();
      
      TextMethods.redText();
      if (cityDefenderInput == manticoreDistance) {
        TextMethods.greenText();
        System.out.println("Direct hit!");        
        manticoreHealth = manticoreHealth - cannonDamage(turnNum);
      } else if (cityDefenderInput >= manticoreDistance) {
        System.out.println("The cannon overshot! It missed the Manticore");
      } else {
        System.out.println("The cannon undershot! It missed the Manticore");
      }
      TextMethods.resetText();
      
      cityHealth--;      
      turnNum++;
      
      if (manticoreHealth <= 0) {
        gameOn = false;
        TextMethods.greenText();
        System.out.println("\nVictory! The Manticore was defeated and Consolas is safe!");
        TextMethods.resetText();
      } else if (cityHealth <= 0) {
        gameOn = false;
        TextMethods.redText();
        System.out.println("\nGame over! The Manticore defeated the city's defences and is going destroy Consolas!");
        TextMethods.resetText();
      }
    } while (gameOn);
  }
  
  // Determine the amount of damage a cannon shot will do
  private static int cannonDamage(int turnNum) {
    int cannonDamage = 1;
    if (turnNum % 3 == 0 && turnNum % 5 == 0) {
      cannonDamage = 10;
      return cannonDamage;
    } else if (turnNum % 3 == 0 || turnNum % 5 == 0) {
      cannonDamage = 3;
      return cannonDamage;
    } else {
      cannonDamage = 1;
      return cannonDamage;
    }
  }
  
  // Some more specific text coloring methods to prevent a horrible code-spaghetti
  private static String redText(String text) {
    return "\u001B[31m" + text + "\u001B[0m";
  }
  
  private static String yellowText(String text) {
    return "\u001B[33m" + text + "\u001B[0m";
  }
  
  private static String cyanText(String text) {
    return "\u001B[36m" + text + "\u001B[0m";
  }
}