public class Max1020 {
  public static void main(String[] args) {
    System.out.println(max1020(12, 9));
    System.out.println(max1020(11, 9));
  }

  private static int max1020(int firstNumber, int secondNumber) {
    if (firstNumber > secondNumber) { // if statement to execute when firstNumber is larger
      if (isViable(firstNumber)) {
        return firstNumber;
      } else if (isViable(secondNumber)) {
        return secondNumber;
      } else return 0;
    } else if (firstNumber < secondNumber) { // if statement to execute when secondNumber is larger
      if (isViable(secondNumber)) {
        return secondNumber;
      } else if (isViable(firstNumber)) {
        return firstNumber;
      } else return 0;
    }
    return 0;
  } // method to determine which number is higher, and which number will be returned

  private static boolean isViable(int checkedNumber) {
    boolean viableNumber;
    if (checkedNumber >= 10 && checkedNumber <= 20) {
      viableNumber = true;
    } else {
      viableNumber = false;
    }
    return viableNumber;
  } // boolean method to check if the number is within the given range
}
