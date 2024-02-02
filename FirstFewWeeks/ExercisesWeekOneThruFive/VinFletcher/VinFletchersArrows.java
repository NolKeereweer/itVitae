package VinFletcher;

import java.util.Scanner;
import ExercisesWeekOneThruFive.TextMethods;

class VinFletchersArrows {

  private static HeadType currentHead = HeadType.WOOD;
  private static FletchType currentFletch = FletchType.GOOSE_FEATHERS;
  
  private static float headCost = 3;
  private static float fletchCost = 3;
  private static String headString = "";
  private static String fletchString = "";
  
  private static Scanner input = new Scanner(System.in);

  private static void factoryArrowResponse(Arrow factoryArrow) {
    System.out.println("That arrow is gonna set you back " + factoryArrow.getCost() + " gold pieces.\n" +
        TextMethods.cyanText("Pleasure doing business. Come again!"));
  }
  
  private static void customArrowMenu() {
    System.out.println(TextMethods.yellowText("Let's build you an arrow :)"));
    headMenu();

    fletchingMenu();

    int shaftChoice = getShaftChoice();

    System.out.println(TextMethods.purpleText("\nAlright calculating your price..."));
    
    Arrow newArrow = new Arrow(currentHead, currentFletch, shaftChoice);
    
    System.out.println("The total cost of your arrow is " + newArrow.getCost() + " gold pieces");
    System.out.println(
        TextMethods.cyanText("Your arrow has a " + headString + " head with " + fletchString + " fletching. And it's " + shaftChoice + " centimeters long."));
  }

  private static void headMenu() {
    System.out.println("Choose a head type: ");
    System.out.println("1. Wood - 3 gold pieces.\n2. Obsidian - 5 gold pieces.\n3. Steel - 10 gold pieces.");
    int headChoice = input.nextInt();

    switch(headChoice) {
      case 1:
        currentHead = HeadType.WOOD;
        headCost = 3;
        headString = "wooden";
        System.out.println(TextMethods.yellowText("Wood? Alright, we have plenty."));
        break;

      case 2:
        currentHead = HeadType.OBSIDIAN;
        headCost = 5;
        headString = "obsidian";
        System.out.println(TextMethods.yellowText("Obsidian it is."));
        break;

      case 3:
        currentHead = HeadType.STEEL;
        headCost = 10;
        headString = "steel";
        System.out.println(TextMethods.yellowText("Steel? Fancy fancy."));
        break;

      default:
        headCost = 3;
        headString = "wooden";
        System.out.println(TextMethods.redText("That's not in stock. ") + TextMethods.yellowText("I can get you a wooden head."));
        break;
    }
  }

  private static void fletchingMenu() {
    System.out.println(TextMethods.yellowText("\nAlright now for the fletching."));
    System.out.println("1. Goose feathers - 3 gold pieces.\n2. Turkey feathers - 5 gold pieces.\n3. Plastic - 10 gold pieces.");
    int fletchChoice = input.nextInt();

    switch(fletchChoice) {
      case 1:
        currentFletch = FletchType.GOOSE_FEATHERS;
        fletchCost = 3;
        fletchString = "goose feathers";
        System.out.println(TextMethods.greenText("Goose feathers coming right up."));
        break;

      case 2:
        currentFletch = FletchType.TURKEY_FEATHERS;
        fletchCost = 5;
        fletchString = "turkey feather";
        System.out.println(TextMethods.greenText("Turkey feathers. You got it."));
        break;

      case 3:
        currentFletch = FletchType.PLASTIC;
        fletchCost = 10;
        fletchString = "plastic";
        System.out.println(TextMethods.greenText("Plastic fletching is truly top of the line."));
        break;

      default:
        fletchCost = 3;
        fletchString = "goose feather";
        System.out.println(TextMethods.redText("That's not an option.") + TextMethods.yellowText("I'll just get you some goose feathers then"));
        break;
    }
  }

  private static int getShaftChoice() {
    System.out.println(TextMethods.yellowText("\nNow for the final step, throw me a number between 60 and 100 for the length of the shaft."));

    boolean validChoice = false;
    int shaftChoice = 0;
    do {
      shaftChoice = input.nextInt();

      if (shaftChoice >= 60 && shaftChoice <= 100) {
        validChoice = true;
        System.out.println(TextMethods.yellowText("Alright! Now that's a length I can work with."));
      } else {
        System.out.println(TextMethods.redText("Sorry chef, no can do. ") + TextMethods.yellowText("Got a different number in mind?"));
      }
    } while (!validChoice);

    System.out.println(TextMethods.yellowText("The pricing is quite cheap luckily. 0,05 gold pieces per centimeter"));
    return shaftChoice;
  }

  public static void main(String[] args) {
    System.out.println(TextMethods.cyanText("Welcome to Vin Fletcher's arrow shop deluxe!\n"));
    
    System.out.println("What kind of arrow would you like?");
    boolean transactionCompleted = false;
    int menuChoice = 0;
    
    do {
      System.out.println("1. Beginner arrow.\n2. Marksman arrow.\n3. Elite arrow.\n4. Custom arrow");
      menuChoice = input.nextInt();
      switch(menuChoice) {
        case 1:
          factoryArrowResponse(Arrow.beginner);
          transactionCompleted = true;
          break;
        case 2:
          factoryArrowResponse(Arrow.marksman);
          transactionCompleted = true;
          break;
        case 3:
          factoryArrowResponse(Arrow.elite);
          transactionCompleted = true;
          break;
        case 4:
          customArrowMenu();
          transactionCompleted = true;
          break;
          
        default:
          System.out.println("That's not one of the options... Try again.");
          break;
      }
    } while (!transactionCompleted);
  }
}