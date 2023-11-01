public class HelDrake extends Bird {
  public HelDrake() {
    super(6, 1_000_000, "Bronze and Black", true);
  }

  @Override
  public void birdPrinter() {
    System.out.println("The HelDrake weighs much more as it is a mechanical bird and has a cannon in it's beak.");
  }
}