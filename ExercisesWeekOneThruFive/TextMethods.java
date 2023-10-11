public class TextMethods {
  static void clearScreen() {
    System.out.print("\033[H\033[2J");
  }
  
  static void resetText() {
    System.out.print("\u001B[0m");
  }
  
  static void redText() {
    System.out.print("\u001B[31m");
  }
  
  static void greenText() {
    System.out.print("\u001B[32m");
  }
  
  static void yellowText() {
    System.out.print("\u001B[33m");
  }
  
  static void blueText() {
    System.out.print("\u001B[34m");
  }
  
  static void purpleText() {
    System.out.print("\u001B[35m");
  }
  
  static void cyanText() {
    System.out.print("\u001B[36m");
  }
  
  static void whiteText() {
    System.out.print("\u001B[37m");
  }
}