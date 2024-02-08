package TheDoor;

import ExercisesWeekOneThruFive.TextMethods;

public class Door {
  public DoorState doorState;

  private int passCode;

  public Door(int passCode) {
    this.passCode = passCode;
    this.doorState = DoorState.CLOSED;
  }

  public String getDoorState() {
    return this.doorState.toString().toLowerCase();
  }

  public int getPassCode() {
    return this.passCode;
  }

  public void changeCode(int oldCode, int newCode) {
    if (oldCode == this.passCode) {
      this.passCode = newCode;
      System.out.println(TextMethods.greenText("Code changed succesfully."));
    } else {
      System.out.println(TextMethods.redText("Code entered did not match. Operation failed."));
    }
  }
}
