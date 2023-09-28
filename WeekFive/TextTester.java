import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class TextTester {
  public static void main(String[] args) {
    System.out.println("Enter a sentence: "); 
    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine(); // intro and handles input
    
    String[] wordCount = sentence.split("\s+"); // splits out the spaces to count the words
    
    System.out.println("\nSentence is " + wordCount.length + " words long"); 
    System.out.println("Sentence is " + sentence.length() + " characters long"); 
    System.out.println("Sentence has " + vowelCounter(sentence) + " vowels"); 
    System.out.println(palindrome(sentence) + "\n\n\n"); 
    letterChecker(sentence); 
    // calling all the methods and with printstatements
  }    
    
    
  // integer method to count all the vowels  
  private static int vowelCounter(String sentence) { 
    char[] vowelArray = {'a', 'e', 'i', 'o', 'u', 'y'};   
    int vowelCount = 0;
    for (char vowels : vowelArray) {
      vowelCount += sentence.chars().filter(ch -> ch == vowels).count();
    }
    return vowelCount;
  }
  
  
  // string method to check for a palindrome
  private static String palindrome(String sentence) {
    StringBuilder strbd = new StringBuilder(sentence);
    String reversedSentence = strbd.reverse().toString();
    
    if (sentence.equals(reversedSentence)) {
      return "Sentence is a palindrome";
    } else {
      return "Not a palindrome.";
    }
  }
  
  
  // void method to display all letters used and their frequency
  private static void letterChecker(String sentence) { 
    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g','h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
    ArrayList<Integer> alphabetCount = new ArrayList<Integer>();
    int index = 0;
    for (char letter : alphabet) {
      alphabetCount.add((int) sentence.chars().filter(ch -> ch == letter).count());
      index++;
    }
    
    int mostFrequent = Collections.max(alphabetCount);
    
    for (int x = mostFrequent; x > 0; x--) {
      for (int i = 0; i < alphabet.length; i++) { 
        if (alphabetCount.get(i) < x) {
          System.out.print("  ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
    System.out.println("a b c d e f g h i j k l m n o p q r s t u v w x y z  ");
  }
}