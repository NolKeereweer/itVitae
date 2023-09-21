import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

class Hangman {
  
  private static final String ANSI_RESET = "\u001B[0m"; // reset text color
  private static final String ANSI_RED = "\u001B[31m"; // set text color red
  private static final String ANSI_GREEN = "\u001B[32m"; // set text color green
  
  public static void main(String[] args) {
    String magicWord; // THE word
    Scanner input = new Scanner(System.in); // open scanner
    
    System.out.print("Enter your word: ");
    magicWord = input.nextLine(); // assign input value to THE word
    
    ArrayList<Character> hiddenWord = new ArrayList<Character>(); // create ArrayList to hide THE word
    
    for (int i = 0; i < magicWord.length(); i++) { // turn the characters in THE word to '_'
      hiddenWord.add('_');
    }
    
    System.out.println("\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\nYou can guess ten times :)\ngo ahead.\n");
    System.out.println(hiddenWord.toString()); // print the '_'s
    
    int guessedCorrect = 0;
    
    for (int j = 0; j < 10; j++) { // giant for loop for the guesses
      System.out.println("Guess a letter. ");
      char guess = input.next().charAt(0); // guessed character (via input)
      
      for (int i = 0; i < magicWord.length(); i++) { // loops through THE word
        if (magicWord.charAt(i) == guess && magicWord.charAt(i) != '_') { // check if the guess is valid
          hiddenWord.set(i, guess); // changes the '_' to the guessed character
          guessedCorrect++;
        }
      }
      
      System.out.println(hiddenWord.toString()); // print the progress
      
      if (j == 6) System.out.println(ANSI_RED + "Three tries left..." + ANSI_RESET);
      
      if (guessedCorrect == magicWord.length()) { // ends the program if the guesses are correct
        System.out.println(ANSI_GREEN + "Success" + ANSI_RESET); 
        System.exit(0);
      }
    }
  }
}