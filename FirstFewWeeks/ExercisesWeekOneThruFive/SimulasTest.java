import java.util.Scanner;

class SimulasTest {
  
  public static Scanner input = new Scanner(System.in);
  
  enum ChestState {
    OPEN, 
    CLOSED, 
    LOCKED;
  }
  
  public static ChestState currentState = ChestState.LOCKED;  
  
  public static void main(String[] args) {
    System.out.print("The chest is currently: " + currentState + ". What do you want to do? ");
    
    for (int i = 0; i <= 2; i++) {
      String stateString = input.nextLine();
      if (stateString.toUpperCase().equals("UNLOCK") && (currentState == ChestState.LOCKED)) {
        currentState = ChestState.CLOSED;
      } else if (stateString.toUpperCase().equals("LOCK") && (currentState == ChestState.CLOSED)) {
        currentState = ChestState.LOCKED;
      } else if (stateString.toUpperCase().equals("CLOSE") && (currentState == ChestState.OPEN)) {
        currentState = ChestState.CLOSED;
      } else if (stateString.toUpperCase().equals("OPEN") && (currentState == ChestState.CLOSED)) {
        currentState = ChestState.OPEN;
      } else {
        System.out.print("Invalid input ");
      }
      System.out.print("The chest is: " + currentState + ". What do you want to do? ");
    }
  }
}