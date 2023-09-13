import java.util.Scanner;

public class ExerciseEight { 
    public static void main(String[] args) {
        System.out.println("Triangle's size is base multiplied by height, divided by 2");
        
        Scanner input = new Scanner(System.in); // open the scanner
        
        System.out.println("Enter the base: ");
        
        double base = input.nextDouble(); // input for the base
        
        System.out.println("Enter the height");
        
        double height = input.nextDouble(); // input for the height
        
        double area = base * height / 2; // this is the calculator
        
        System.out.println(base + " multiplied by " + height + " divided by 2 is: " + area);
    }
}