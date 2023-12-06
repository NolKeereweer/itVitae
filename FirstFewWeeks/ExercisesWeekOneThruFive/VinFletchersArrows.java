import java.util.Scanner;

class VinFletchersArrows {

  enum HeadType {
    WOOD,
    OBSIDIAN,
    STEEL;
  }
  
  enum FletchType {
    GOOSE_FEATHERS,
    TURKEY_FEATHERS,
    PLASTIC;
  }
  
  static class Arrow {
    private HeadType headType;
    private FletchType fletchType;
    private int shaftLength;
    
    public Arrow(HeadType headType, FletchType fletchType, int shaftLength) {
      this.headType = headType;
      this.fletchType = fletchType;
      this.shaftLength = shaftLength;
    }
  }
  
  static float getCost(float headCost, float fletchCost, int shaftLength) {
    float shaftCost = (float) shaftLength * 0.05f;
    
    float totalCost = headCost + fletchCost + shaftCost;
    return totalCost;
  }

  static float getCost(Arrow arrow) {
    float headCost = 0.0f;
    float fletchCost = 0.0f;
    float shaftCost = (float) shaftLength * 0.05f;
    
    if (HeadType == HeadType.WOOD) {
      headCost = 3;
    } else if (HeadType == HeadType.OBSIDIAN) {
      headCost = 5;
    } else {
      headCost = 10;
    }
    
    float totalCost = headCost + fletchCost + shaftCost;
    return totalCost;
  }
  
  Arrow eliteArrow = new Arrow(HeadType.STEEL, FletchType.PLASTIC, 95);
  Arrow marksmanArrow = new Arrow(HeadType.STEEL, FletchType.GOOSE_FEATHERS, 65);
  Arrow beginnerArrow = new Arrow(HeadType.WOOD, FletchType.GOOSE_FEATHERS, 75);
  
  private static HeadType currentHead = HeadType.WOOD;
  private static FletchType currentFletch = FletchType.GOOSE_FEATHERS;
  
  private static float headCost = 3;
  private static float fletchCost = 3;  
  private static String headString = "";
  private static String fletchString = "";
  
  private static Scanner input = new Scanner(System.in);
  
  private static void customArrowMenu() {
    System.out.println(TextMethods.yellowText("Let's build you an arrow :)"));
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
    
    System.out.println(TextMethods.purpleText("\nAlright calculating your price..."));
    
    Arrow newArrow = new Arrow(currentHead, currentFletch, shaftChoice);
    
    System.out.println("The total cost of your arrow is " + getCost(headCost, fletchCost, shaftChoice) + " gold pieces");
    System.out.println(TextMethods.cyanText("Your arrow has a " + headString + " head with " + fletchString + " fletching. And it's " + shaftChoice + " centimeters long."));
  }
  
  public static void main(String[] args) {
    System.out.println(TextMethods.cyanText("Welcome to Vin Fletcher's arrow shop deluxe!\n"));
    
    System.out.println("What kind of arrow would you like?");
    boolean validInput = false;
    int menuChoice = 0;
    
    do {
      System.out.println("1. Beginner arrow.\n2. Marksman arrow.\n3. Elite arrow.\n4. Custom arrow");
      menuChoice = input.nextInt();
      switch(menuChoice) {
        case 1:
          
        case 2:
        
        case 3:
        
        case 4:
          customArrowMenu();
          validInput = true;
          break;
          
        default:
          break;
      }
    } while (!validInput);
  }
}