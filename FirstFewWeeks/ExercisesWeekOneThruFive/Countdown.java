class Countdown {
  public static void main(String[] args) {
    countDown(10);
  }
  
  private static void countDown(int num) {
    if (num == 1) {
      System.out.println("1");
    } else {
      System.out.println(num);
      countDown(num - 1);
    }
  }
}