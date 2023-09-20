public class PosNeg {
  public static void main(String[] args) {
    System.out.println(posNeg(1, -1, false));
    System.out.println(posNeg(-4, -5, true));
    System.out.println(posNeg(-1, 1, true));
  }

  private static boolean posNeg(int a, int b, boolean negative) { // very lengthy boolean method
    boolean bothNeg;
    if (a <= 0 && b <= 0) { // statement to check if both numbers are negative
      bothNeg = true;
    } else {
      bothNeg = false;
    }

    boolean singleNeg;
    if (negative == true
        && !bothNeg) { // statement to check if one number is negative and the parameter is true
      singleNeg = true;
    } else {
      singleNeg = false;
    }

    boolean endNeg;
    if (bothNeg) { // statement to finalise the response/return/output
      endNeg = true;
    } else if (singleNeg) {
      endNeg = false;
    } else {
      endNeg = true;
    }
    return endNeg;
  }
}
