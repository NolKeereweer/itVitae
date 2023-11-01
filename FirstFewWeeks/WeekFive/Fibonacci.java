class Fibonacci {
  public static void main(String[] args) {
    System.out.println(fibonacci(4));
    System.out.println(fibonacci(5));
    System.out.println(fibonacci(6));
  }
  
  private static int fibonacci(int n) {
    return (n <= 1 ? (n) : (fibonacci(n - 1) + fibonacci(n - 2)));
  }
}