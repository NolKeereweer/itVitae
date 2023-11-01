import java.util.Scanner;
import java.awt.Toolkit;

class ExerciseEleven {
    
    private static final String ANSI_RESET = "\u001B[0m"; // reset text color   
    private static final String ANSI_RED = "\u001B[31m"; // set text color to red
    private static final String ANSI_GREEN = "\u001B[32m"; // set text color to green
    
    private static String makeIntRed() { // method to turn the text color red
        System.out.print(ANSI_RED);
        return ANSI_RED;
    }
    
    private static String resetColor() { // method to reset text color
        System.out.print(ANSI_RESET);        
        return ANSI_RESET;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // open/declare a scanner called input
        
        System.out.println("Quick! What's the target? Who do we protect?");        
        System.out.print("Target row? ");
        makeIntRed(); 
        final int row = input.nextInt();
        resetColor();
        System.out.print("Target column? ");
        makeIntRed();
        final int column = input.nextInt();
        resetColor(); 
        
        String target = row + ", " + column; // transfer input into target
        makeIntRed();
        System.out.println("The target is " + target);
        resetColor();
        
        int rowHigh = row - 1; // initialise coordinates needed to display protected blocks
        int rowLow = row + 1;
        int columnLeft = column - 1;
        int columnRight = column + 1; 
        
        System.out.println("Barrier carriers deployed at:");
        makeIntRed();
        System.out.println(rowHigh + ", " + column); // display all protected blocks/coordinates
        System.out.println(row + ", " + columnRight);
        System.out.println(rowLow + ", " + column);
        System.out.println(row + ", " + columnLeft); 
        resetColor();
        
        // final print statement
        System.out.println(ANSI_GREEN + "Block " + target + " Succesfully protected!");        
        resetColor(); 
        
        Toolkit.getDefaultToolkit().beep(); // make a sound
    }
}