import java.util.Scanner;

public class ExerciseNine { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("give 2 seperate values, we shall see if the last digits are teh same");
        
        int numberOne = input.nextInt(); 
        int numberTwo = input.nextInt();
        
        boolean sameOrNot;
        
        if (numberOne % 10 == numberTwo % 10) { // compares remainders of modulo 10
            sameOrNot = true;
        } else {
            sameOrNot = false;   
        }
        
        System.out.println(numberOne + " , " + numberTwo + " " + sameOrNot);
    }
}