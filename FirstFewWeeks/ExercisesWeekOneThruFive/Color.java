public class Color {
  private int r = 0;
  private int g = 0;
  private int b = 0;

  private Color(int r, int g, int b) {
    this.r = r;
    this.g = g;
    this.b = b;
  }

  public final static Color WHITE = new Color(255, 255, 255);
  public final static Color BLACK = new Color(0, 0, 0);
  public final static Color RED = new Color(255, 0, 0);
  public final static Color ORANGE = new Color(255, 128, 0);
  public final static Color YELLOW = new Color(255, 255, 0);
  public final static Color GREEN = new Color(0, 128, 0);
  public final static Color BLUE = new Color(0, 0, 255);
  public final static Color PURPLE = new Color(128, 0, 128);

  public String toString() {
    return "(" + r + ", " + g + ", " + b + ")";
  }

  public static void main(String[] args) {
    Color aqua = new Color(0, 255, 255);
    Color blue = Color.BLUE;

    System.out.println(aqua);
    System.out.println(blue);
  }
}
