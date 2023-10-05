import java.util.Scanner;

class LastTheoryExcersiseThursday {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("On a wild river somewhere in a rainforest on the other side of the universe...");
    System.out.println("\nWhile rafting with friends you and your boat hit an astoundingly rough wave....");
    // little story
    
    System.out.println("\nDo you get wet?!?!?!");
    CyanText();
    String wetResult = input.nextLine().toLowerCase();
    ResetText();
    // ask for a user input, turn that text cyan before resetting text color
    
    boolean fall;
    if (wetResult.equals("no")) {
      fall = false;
    } else {
      fall = true;
    } // boolean to check if user falls in water
    
    try {
      FallOutOfRaft(fall);      
    } catch (FallOutException e) {
      RedText();
      System.out.println(e + "\n");
      ResetText();
    } // try catch to figure out what to print
    
    System.out.println("Do you lose your paddle?!?!");
    CyanText();
    String paddleResult = input.nextLine().toLowerCase();
    ResetText();
    
    boolean paddleDrop;
    if (paddleResult.equals("no")) {
      paddleDrop = false;
    } else {
      paddleDrop = true;
    } // boolean to check if the paddle is dropped in the water
    
    try {
      DropPaddle(paddleDrop);
    }catch (DroppedPaddleException e) {
      RedText();
      System.out.println(e + "\n");
      ResetText();
    } // try catch to figure out what to print
    
    finally {
      PayForRaft();
    } // final method call (line 77-81)
  }
  
  private static void FallOutOfRaft(boolean fall) throws FallOutException {    
    if (!fall) {
      GreenText();
      System.out.println("You stayed in the Raft. Good Job!\n");
      ResetText();
    } else {
      throw new FallOutException();
    } // check to see if the custom exception needs to be thrown (line 102-106)
  }
  
  private static void DropPaddle(boolean paddleDrop) throws DroppedPaddleException {
    if (!paddleDrop) {
      GreenText();
      System.out.println("You kept the paddle in your hands. Well done!");
      ResetText();
    } else {
      throw new DroppedPaddleException();
    } // check to see if custom exception needs to be thrown (line 108-112)
  }
  
  private static void PayForRaft() {
    RedText();
    System.out.println("You pay the cost of the rafting adventure.");
    ResetText();
  } // method that prints something (called at line 53)
  
  private static void ResetText() {
    System.out.print("\u001B[0m");
  } // method te reset text color
  
  private static void RedText() {
    System.out.println("\u001B[31m");
  } // method to set text color to red
  
  private static void GreenText() {
    System.out.print("\u001B[32m");
  } // method to set text color to green
  
  private static void CyanText() {
    System.out.print("\u001B[36m");
  } // method to set color to cyan
  
  
}

class FallOutException extends Exception {
  FallOutException(){
    super("Oh no you fell into the water... Now you're all wet :(");
  }
} // custom exception when user falls in the water

class DroppedPaddleException extends Exception {
  DroppedPaddleException(){
    super("Oh no you dropped your paddle! You better try getting it back.");
  }
} // custom exception when user drops the paddle