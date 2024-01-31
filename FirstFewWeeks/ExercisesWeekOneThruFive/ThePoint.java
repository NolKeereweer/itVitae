public class ThePoint {
  private int x = 0;
  private int y = 0;

  private ThePoint() {
    this.x = 0;
    this.y = 0;
  }

  private ThePoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  public static void main(String[] args) {
    ThePoint origin = new ThePoint();
    ThePoint pointOne = new ThePoint(2, 3);
    ThePoint pointTwo = new ThePoint(-4, 0);

    System.out.println("The origin: " + origin);
    System.out.println("First point: " + pointOne);
    System.out.println("Second point: " + pointTwo);
  }
}
