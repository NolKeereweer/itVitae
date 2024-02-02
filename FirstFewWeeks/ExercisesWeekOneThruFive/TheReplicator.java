import java.util.Scanner;
import ExercisesWeekOneThruFive.TextMethods;

class TheReplicator {
  private static Scanner input = new Scanner(System.in);
  
  public static void main(String[] args) {
    int[] firstArray = new int[5];
    System.out.println("Enter 5 numbers to create your array: ");
    
    TextMethods.yellowText();
    for (int i = 0; i < firstArray.length; i++) {
      firstArray[i] = input.nextInt();
    }
    TextMethods.resetText();
    
    System.out.println("\nArray created. \nReplicating... \nReplicating... \nReplicating...\n");
    
    int[] replicatedArray = new int[firstArray.length];    
    for (int i = 0; i <= 4; i++) {
      replicatedArray[i] = firstArray[i];
    }
    
    TextMethods.greenText();
    System.out.println("Original array: ");
    for (int i = 0; i <= firstArray.length - 1; i++) {
      if (i == firstArray.length - 1) {
        System.out.print(firstArray[i]);    
      } else {
        System.out.print(firstArray[i] + ", ");
      }
    }
    
    
    System.out.println("\n\nReplicated array: ");
    for (int i = 0; i <= replicatedArray.length - 1; i++) { 
      if (i == replicatedArray.length - 1) {
        System.out.print(replicatedArray[i]);    
      } else {
        System.out.print(replicatedArray[i] + ", ");
      }
    }
    TextMethods.resetText();
  }
}