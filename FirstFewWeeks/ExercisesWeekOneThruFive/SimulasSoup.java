import java.util.Scanner;
import ExercisesWeekOneThruFive.TextMethods;

class SimulasSoup {

  private static Scanner input = new Scanner(System.in);
  
  enum FoodType {
    SOUP,
    STEW,
    GUMBO;
  }
  
  enum MainIngredient {
    MUSHROOM,
    CHICKEN,
    CARROTS,
    POTATOES;
  }
  
  enum Seasoning {
    SPICY,
    SALTY,
    SWEET;
  }  
  
  public static class composedSoup {
  
    private FoodType foodType; 
    private MainIngredient mainIngredient;
    private Seasoning seasoning;
    
    public composedSoup(FoodType foodType, MainIngredient mainIngredient, Seasoning seasoning) {
      this.foodType = foodType;
      this.mainIngredient = mainIngredient;
      this.seasoning = seasoning;
    }
  }
  
    public static FoodType currentType = FoodType.SOUP;
    public static MainIngredient currentIngredient = MainIngredient.CHICKEN;
    public static Seasoning currentSeasoning = Seasoning.SPICY;
    
  public static void main(String[] args) {
    
    String newType = "soup";
    String newIngredient = "chicken";
    String newSeasoning = "spicy";
    
    System.out.println("Welcome to the soup builder.");
    System.out.println("First, please select your food type:\n1. Soup\n2. Stew\n3. Gumbo");
    int firstChoice = input.nextInt();
    
    switch(firstChoice) {
      case 1: 
        currentType = FoodType.SOUP;
        newType = "soup";
        break;
        
      case 2:
        currentType = FoodType.STEW;
        newType = "stew";
        break;
      
      case 3:
        currentType = FoodType.GUMBO;
        newType = "gumbo";
        break;
      
      default:
        TextMethods.redText();
        System.out.println("I don't agree with that input. YOU GET SOUP!");
        TextMethods.resetText();
        break;
    }
    
    System.out.println("Excellent. Now please select main ingredient:\n1. Mushroom\n2. Chicken\n3. Carrots\n4. Potatoes");
    int secondChoice = input.nextInt();
    
    switch(secondChoice) {
      case 1: 
        currentIngredient = MainIngredient.MUSHROOM;
        newIngredient = "mushroom";
        break;
        
      case 2:
        currentIngredient = MainIngredient.CHICKEN;
        newIngredient = "chicken";
        break;
      
      case 3:
        currentIngredient = MainIngredient.CARROTS;
        newIngredient = "carrot";
        break;
      
      case 4:
        currentIngredient = MainIngredient.POTATOES;
        newIngredient = "potato";
        break;
      
      default:
        TextMethods.redText();
        System.out.println("I don't agree with that input. YOU GET CHICKEN!");
        TextMethods.resetText();
        break;
    }
    
    System.out.println("Very well. Now for the seasoning:\n1. Spicy\n2. Salty\n3. Sweet");
    int thirdChoice = input.nextInt();
    
    switch(thirdChoice) {
      case 1: 
        currentSeasoning = Seasoning.SPICY;
        newSeasoning = "spicy";
        break;
        
      case 2:
        currentSeasoning = Seasoning.SALTY;
        newSeasoning = "salty";
        break;
      
      case 3:
        currentSeasoning= Seasoning.SWEET;
        newSeasoning = "sweet";
        break;
      
      default:
        TextMethods.redText();
        System.out.println("I don't agree with that input. YOU GET SPICY!");
        TextMethods.resetText();
        break;
    }
    
    System.out.println("Alright. The soup will be composed. Standby.");
    
    composedSoup userSoup = new composedSoup(currentType, currentIngredient, currentSeasoning);
    
    System.out.print("You have created a ");
    System.out.print(newSeasoning + " " + newIngredient + " " + newType);
    System.out.println(" Congratulations :)");
  }
}

