public class Penguin extends bird {
  public Penguin() {
    setWings(2);
    setWeight(1220);
    setColour("Black and white");
    setFlyStatus(false);
  }

  @Override
  public void birdPrinter() {
    System.out.println("Unlike other birds the penguin is a flightless one.");
  }
}
