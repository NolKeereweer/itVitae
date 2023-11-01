public class Penguin extends Bird {
  public Penguin() {
    super(2, 1220, "Black and white", false);
  }

  @Override
  public void birdPrinter() {
    System.out.println("Unlike other birds the penguin is a flightless one.");
  }
}
