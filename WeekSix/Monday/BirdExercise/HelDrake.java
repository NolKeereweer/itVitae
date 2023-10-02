public class HelDrake extends bird {
  public HelDrake() {
    setWings(6);
    setWeight(1000000);
    setColour("Bronze and black");
    setFlyStatus(true);
  }

  @Override
  public void birdPrinter() {
    System.out.println("The HelDrake weighs much more as it is a mechanical bird and has a cannon in it's beak.");
  }
}