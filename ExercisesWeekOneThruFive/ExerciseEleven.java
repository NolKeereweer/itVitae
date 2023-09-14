import java.util.Scanner;
import java.awt.Toolkit;

class ExerciseEleven {
    
    private static final String ANSI_RESET = "\u001B[0m";    
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m"; // different used text colors
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Quick! What's the target? Who do we protect?");
        
        System.out.print("Target row? " + ANSI_RED);
        final int row = input.nextInt();
        System.out.print(ANSI_RESET + "Target column? " + ANSI_RED);
        final int column = input.nextInt();
        System.out.print(ANSI_RESET); // gathered user input 
        
        String target = row + ", " + column; // transfer input into target
        System.out.println("The target is " + ANSI_RED + target);
        
        int rowHigh = row - 1;
        int rowLow = row + 1;
        int columnLeft = column - 1;
        int columnRight = column + 1; // created all used coordinates        
        
        System.out.println("Barrier carriers deployed at:\n" + rowHigh + ", " + column);
        System.out.println(row + ", " + columnRight);
        System.out.println(rowLow + ", " + column);
        System.out.println(row + ", " + columnLeft); // displayed all protected blocks/coordinates
        
        System.out.println(ANSI_RESET + "Block " + row + ", " + column + ANSI_GREEN + " Succesfully protected!");
        
        System.out.println(ANSI_RESET); // reset text color
        
        Toolkit.getDefaultToolkit().beep(); // make a sound
    }    
}