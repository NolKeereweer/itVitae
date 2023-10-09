public class TextMethods {
  static void ClearScreen() {
    System.out.print("\033[H\033[2J");
  }
  
  static void ResetText() {
    System.out.print("\u001B[0m");
  }
  
  static void RedText() {
    System.out.print("\u001B[31m");
  }
  
  static void GreenText() {
    System.out.print("\u001B[32m");
  }
  
  static void YellowText() {
    System.out.print("\u001B[33m");
  }
  
  static void BlueText() {
    System.out.print("\u001B[34m");
  }
  
  static void PurpleText() {
    System.out.print("\u001B[35m");
  }
  
  static void CyanText() {
    System.out.print("\u001B[36m");
  }
  
  static void WhiteText() {
    System.out.print("\u001B[37m");
  }
}