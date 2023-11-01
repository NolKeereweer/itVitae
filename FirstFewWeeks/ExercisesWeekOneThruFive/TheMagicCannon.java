class TheMagicCannon {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println(i + ": Fire and electric combo");
      } else if (i % 3 == 0 && i % 5 != 0) {
        System.out.println(i + ": Fire");
      } else if (i % 3 != 0 && i % 5 == 0) {
        System.out.println(i + ": Electric");
      } else {
        System.out.println(i + ": Normal");
      }
    }
  }
}