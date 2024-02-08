package TheDoor;

import ExercisesWeekOneThruFive.TextMethods;
import java.util.Scanner;

public class UI {

  public static Scanner input = new Scanner(System.in);

  public static void unlockLogic(Door door) {
    System.out.println("Enter passcode: ");
    int inpPasscode = input.nextInt();

    if (inpPasscode != door.getPassCode()) {
      System.out.println("Wrong code. Action failed.");
    } else {
      System.out.println("Door is now unlocked.");
      door.doorState = DoorState.CLOSED;
    }
  }

  public static void lockLogic(Door door) {
    System.out.println("Enter passcode: ");
    int inpPasscode = input.nextInt();

    if (inpPasscode != door.getPassCode()) {
      System.out.println("Wrong code. Action failed.");
    } else {
      System.out.println("Door is now locked.");
      door.doorState = DoorState.LOCKED;
    }
  }

  public static void stateMenu(Door door) {
    System.out.println("The door is now " + door.getDoorState() + ".");
    System.out.println("What do you want to do with the door?");
    System.out.println("1. Open the door.\n2. Close the door.\n3. Unlock the door.\n4. Lock the door.\n5. Quit.");
    int menuChoice = input.nextInt();
    boolean quitMenu = false;

    do {
      switch (menuChoice) {
        case 1:
          if (door.getDoorState().equals("open")) {
            System.out.println(TextMethods.redText("Door is already open."));
          } else if (door.getDoorState().equals("closed")) {
            System.out.println("Door is now open.");
            door.doorState = DoorState.OPEN;
          } else if (door.getDoorState().equals("locked")) {
            System.out.println("Cannot open, door is locked.");
          }
          break;
        case 2:
          if (door.getDoorState().equals("open")) {
            System.out.println("Door is now closed.");
            door.doorState = DoorState.CLOSED;
          } else if (door.getDoorState().equals("closed")) {
            System.out.println("Door is already closed.");
          } else if (door.getDoorState().equals("locked")) {
            System.out.println("Door is locked and therefore already closed.");
          }
          break;
        case 3:
          if (door.getDoorState().equals("open")) {
            System.out.println("Door is already open.");
          } else if (door.getDoorState().equals("closed")) {
            System.out.println("Door is already unlocked.");
          } else if (door.getDoorState().equals("locked")) {
            unlockLogic(door);
          }
          break;
        case 4:
          if (door.getDoorState().equals("open")) {
            System.out.println("Door needs to be closed before you can lock it.");
          } else if (door.getDoorState().equals("closed")) {
            lockLogic(door);
          } else if (door.getDoorState().equals("locked")) {
            System.out.println("Door is already locked.");
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

    door.changeCode(oldCode, newCode);
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
