package TheDoor;

import ExercisesWeekOneThruFive.TextMethods;
import java.util.Scanner;

public class UI {

  public static Scanner input = new Scanner(System.in);

  public static void stateMenu(Door door) {
    boolean quitMenu = false;
    System.out.println("The door is now " + door.getDoorState() + ".");
    do {

      System.out.println("What do you want to do with the door?");
      System.out.println("1. Open the door.\n2. Close the door.\n3. Unlock the door.\n4. Lock the door.\n5. Quit.");
      int menuChoice = input.nextInt();


      switch (menuChoice) {
        case 1:
          try {
            door.open();
            System.out.println(TextMethods.greenText("Door opened successfully."));
          } catch(DoorStateException e) {
            System.out.println(TextMethods.redText(e.getMessage()));
          }
          break;
        case 2:
          try {
            door.close();
            System.out.println(TextMethods.greenText("Door closed successfully."));
          } catch (DoorStateException e) {
            System.out.println(TextMethods.redText(e.getMessage()));
          }
          break;
        case 3:
          System.out.println("Enter passcode:");
          int unlockPasscode = input.nextInt();

          try {
            door.unlock(unlockPasscode);
            System.out.println(TextMethods.greenText("Door unlocked successfully."));
          } catch (DoorStateException e) {
            System.out.println(TextMethods.redText(e.getMessage()));
          } catch (PassCodeException e) {
            System.out.println(TextMethods.redText(e.getMessage()));
          }
          break;
        case 4:
          System.out.println("Enter passcode:");
          int lockPasscode = input.nextInt();

          try {
            door.lock(lockPasscode);
            System.out.println(TextMethods.greenText("Door locked successfully."));
          } catch (DoorStateException e) {
            System.out.println(TextMethods.redText(e.getMessage()));
          } catch (PassCodeException e) {
            System.out.println(TextMethods.redText(e.getMessage()));
          }
          break;
        case 5:
          System.out.println("Shutting down.");
          quitMenu = true;
          break;
        default:
          System.out.println("Not an option. Try again.");
          break;
      }
    } while (!quitMenu);
  }

  public static void codeMenu(Door door) {
    System.out.print("Enter the passcode to your door: ");
    int oldCode = input.nextInt();
    System.out.print("Now enter the new code: ");
    int newCode = input.nextInt();

    try {
      door.changeCode(oldCode, newCode);
      System.out.println("Code successfully changed.");
    } catch (PassCodeException e) {
      System.out.println(e.getMessage());
    }
  }

  public static void main(String[] args) {
    System.out.println(TextMethods.blueText("This is THE DOOR dun dun duuuunnnnnnn"));
    System.out.println(TextMethods.cyanText("Enter a numeric passcode to create your door :)"));

    int inPassCode = input.nextInt();
    Door newDoor = new Door(inPassCode);

    System.out.print("The door you've created is now: ");
    System.out.println(newDoor.getDoorState());

    System.out.println("What would you like to do with your door?");
    System.out.println("1. Interact with the door \n2. Change passcode");
    int menuChoice = input.nextInt();
    boolean validInput = false;

    do {
      switch (menuChoice) {
        case 1:
          stateMenu(newDoor);
          validInput = true;
          break;
        case 2:
          codeMenu(newDoor);
          validInput = true;
          break;
        default:
          System.out.println(TextMethods.redText("Invalid input. Try again."));
          break;
      }
    } while (!validInput);
  }
}
