class CreateThreeDigitNumbers {
  public static void main(String[] args) {
    int uniqueNumbers = 0;

    for (int firstDigit = 1; firstDigit <= 4; firstDigit++) {
      for (int secondDigit = 1; secondDigit <= 4; secondDigit++) {
        for (int thirdDigit = 1; thirdDigit <= 4; thirdDigit++) {
          if (thirdDigit != secondDigit && thirdDigit != firstDigit && secondDigit != firstDigit) {
            System.out.printf("%d%d%d%n", firstDigit, secondDigit, thirdDigit);
            uniqueNumbers++;
          }
        }
      }
    }
    TextMethods.GreenText();
    System.out.println("\nTotal of unique numbers: " + uniqueNumbers);
    TextMethods.ResetText();
  }
}
