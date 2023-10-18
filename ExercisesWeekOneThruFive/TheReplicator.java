import java.util.Scanner;

class TheReplicator {
  private static Scanner input = new Scanner(System.in);
  
  public static void main(String[] args) {
    int[] firstArray = new int[5];
    System.out.println("Enter 5 numbers to create your array: ");
    
    TextMethods.yellowText();
    for (int i = 0; i <=4; i++) {
      firstArray[i] = input.nextInt();
    }
    TextMethods.resetText();
    
    System.out.println("\nArray created. \nReplicating... \nReplicating... \nReplicating...\n");
    
    int[] replicatedArray = new int[5];    
    for (int i = 0; i <= 4; i++) {
      replicatedArray[i] = firstArray[i];
    }
    
    TextMethods.greenText();
    System.out.println("Original array: ");
    for (int i = 0; i <= 4; i++) { 
      System.out.print(firstArray[i] + ", ");    
    }
    
    
    System.out.println("\n\nReplicated array: ");
    for (int i = 0; i <= 4; i++) { 
      System.out.print(replicatedArray[i] + ", ");    
    }
    TextMethods.resetText();
  }
}