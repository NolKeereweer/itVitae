import java.util.Scanner;
import java.util.Arrays;

class ArrayOpdracht {
  public static void main(String[] args) {
    int[] numbers; // initialise an integer array called numbers
    Scanner input = new Scanner(System.in); // initialise/open a scanner to gather user input
    
    System.out.print("Enter number of items: ");
    final int NUM_ITEMS = input.nextInt(); // initialise and immedialty give value to an integer
    
    numbers = new int[NUM_ITEMS]; // allocate memory/space for the numbers array
    
    System.out.print("Enter the values of these numbers: ");
    
    for (int i = 0; i < NUM_ITEMS; i++) { // for loop to gather the values of each of the items 
      numbers[i] = input.nextInt(); 
    }
    
    System.out.println(Arrays.toString(numbers)); // print statement with an Array to string method
  }
}