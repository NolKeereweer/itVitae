import java.util.Scanner;

public class ExerciseNine { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many eggs were laid: ");
        
        int chocoEggs = input.nextInt();
        
        final int sisters = 4;
        
        int eggsDivided = chocoEggs / sisters;
        
        int duckbearEggs = chocoEggs % sisters;

        System.out.println("Each sister gets " + eggsDivided + " and there are " + duckbearEggs + " eggs for the duckbear.");
        
        System.out.println("The answer to the question hidden in the objectives is: 3 and 7 and 11");
    }
}