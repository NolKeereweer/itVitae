package TheDoor;

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

  public void changeCode(int oldCode, int newCode) throws PassCodeException{
    if (oldCode != this.passCode) {
      throw new PassCodeException("Action failed. Wrong code.");
    }

    this.passCode = newCode;
  }

  public void open() throws DoorStateException{
    if (this.doorState == DoorState.OPEN) {
      throw new DoorStateException("Action failed. Door is already open.");
    }

    if (this.doorState == DoorState.LOCKED) {
      throw new DoorStateException("Action failed. Door is locked");
    }

    this.doorState = DoorState.OPEN;
  }

  public void close() throws DoorStateException {
    if (this.doorState == DoorState.CLOSED) {
      throw new DoorStateException("Action failed. Door is already closed.");
    }

    if (this.doorState == DoorState.LOCKED) {
      throw new DoorStateException("Action failed. Door is locked");
    }

    this.doorState = DoorState.CLOSED;
  }

  public void lock(int passCode) throws DoorStateException, PassCodeException {
    if (this.doorState == DoorState.OPEN) {
      throw new DoorStateException("Action failed. Door is open.");
    }

    if (this.doorState == DoorState.LOCKED) {
      throw new DoorStateException("Action failed. Door is already locked");
    }

    if (passCode != this.passCode) {
      throw new PassCodeException("Action failed. Wrong code.");
    }

    this.doorState = DoorState.LOCKED;
  }

  public void unlock(int passCode) throws DoorStateException, PassCodeException {
    if (this.doorState == DoorState.OPEN) {
      throw new DoorStateException("Action failed. Door is open.");
    }

    if (this.doorState == DoorState.CLOSED) {
      throw new DoorStateException("Action failed. Door is already unlocked.");
    }

    if (passCode != this.passCode) {
      throw new PassCodeException("Action failed. Wrong passcode.");
    }

    this.doorState = DoorState.CLOSED;
  }
}
