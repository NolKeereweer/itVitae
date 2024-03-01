package ExercisesWeekOneThruFive;

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
  
  public static String redText(String text) {
    return "\u001B[31m" + text + "\u001B[0m";
  }
  
  public static String greenText(String text) {
    return "\u001B[32m" + text + "\u001B[0m";
  }
  
  public static String yellowText(String text) {
    return "\u001B[33m" + text + "\u001B[0m";
  }
  
  public static String blueText(String text) {
    return "\u001B[34m" + text + "\u001B[0m";
  }
  
  public static String purpleText(String text) {
    return "\u001B[35m" + text + "\u001B[0m";
  }
  
  public static String cyanText(String text) {
    return "\u001B[36m" + text + "\u001B[0m";
  }
  
  public static String whiteText(String text) {
    return "\u001B[37m" + text + "\u001B[0m";
  }

  public static String capitalise(String text) {return text.substring(0,1).toUpperCase() + text.substring(1);}
}