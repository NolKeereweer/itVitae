public class TextMethods {
  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
  }
  
  public static void resetText() {
    System.out.print("\u001B[0m");
  }
  
  public static void redText() {
    System.out.print("\u001B[31m");
  }
  
  public static void greenText() {
    System.out.print("\u001B[32m");
  }
  
  public static void yellowText() {
    System.out.print("\u001B[33m");
  }
  
  public static void blueText() {
    System.out.print("\u001B[34m");
  }
  
  public static void purpleText() {
    System.out.print("\u001B[35m");
  }
  
  public static void cyanText() {
    System.out.print("\u001B[36m");
  }
  
  public static void whiteText() {
    System.out.print("\u001B[37m");
  }
}