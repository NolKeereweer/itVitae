public class PosNeg {
  public static void main(String[] args) {
    System.out.println(posNeg(1, -1, false));
    System.out.println(posNeg(-4, -5, true));
    System.out.println(posNeg(-1, 1, true));
    System.out.println(posNeg(0, 0, true));
    System.out.println(posNeg(0, 0, false));
    System.out.println(posNeg(-5, 0, false));
    System.out.println(posNeg(-5, 0, true));
  }

  private static boolean posNeg(int a, int b, boolean negative) { 
    if (negative) { 
      return a < 0 && b < 0;
    } else {
      return ((a < 0 && b > 0) || (a > 0 && b < 0));
    }
  }
}