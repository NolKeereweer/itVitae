class EvenSumOfDigits {
  public static void main(String[] args) {
    int val;
    for (int i = 0; i <= 4; i++) {
      for (int j = 0; j <= 9; j++) {
        val = 1 + i + j;
        if (val % 2 == 0) {
          System.out.println(1 + "" + i + "" + j);
        }
      }
    }
  }
}
