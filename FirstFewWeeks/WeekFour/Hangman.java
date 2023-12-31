import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Toolkit;

class Hangman {
  
  private static final String ANSI_RESET = "\u001B[0m"; // reset text color
  private static final String ANSI_RED = "\u001B[31m"; // set text color red
  private static final String ANSI_GREEN = "\u001B[32m"; // set text color green
  private static final String ANSI_ESCAPE = "\033[H\033[2J" ; // clear the screen 
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int guessedCorrect = 0;
    int guessedWrong = 0;
    boolean guessedLetter = false;
    
    System.out.print("Enter your word: ");
    String actualWord = input.nextLine(); // assign input value to THE word
    
    ArrayList<Character> shownWord = new ArrayList<Character>(); // create ArrayList to hide THE word
    
    for (int i = 0; i < actualWord.length(); i++) { // turn the characters in THE word into '_'
      shownWord.add('_');
    }
    
    System.out.println(ANSI_ESCAPE + "You can make 5 mistakes, then it's game over...");
    System.out.println(shownWord.toString()); // print the '_'s
    
    for (int j = 0; j < 15; j++) { // giant for loop for the guesses
      System.out.println("Guess a letter. ");
      char guess = input.next().charAt(0); // guessed character (via input)
      
      for (int i = 0; i < actualWord.length(); i++) { // loops through THE word
        if (actualWord.charAt(i) == guess) {
          guessedLetter = true;
            if (shownWord.get(i) == '_') { 
              shownWord.set(i, guess);
            } else {
              break;
            }
        } 
      }
      
      if (guessedLetter) guessedCorrect++;
      if (!guessedLetter) guessedWrong++;
      
      System.out.println(shownWord.toString()); // print the progress
      
      if (guessedWrong == 4) System.out.println(ANSI_RED + "One mistake left..." + ANSI_RESET);
      
      if (guessedWrong == 5) {
        System.out.println(ANSI_RED + "AHAHAHAHAHAH RIP BOZO L GEPAKT!!!!!" + ANSI_RESET);
        break;
      }
      
      if (guessedCorrect == actualWord.length()) { // ends the program if the guesses are correct
        Toolkit.getDefaultToolkit().beep();
        System.out.println(ANSI_GREEN + "Success" + ANSI_RESET); 
        break;
      }
    }
  }
}