import java.util.Scanner;

public class ExerciseEight { 
    public static void main(String[] args) {
        System.out.println("Triangle's size is base multiplied by height, divided by 2");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the base: ");
        
        double base = input.nextDouble();
        
        System.out.println("Enter the height");
        
        double height = input.nextDouble();
        
        double area = base * height / 2;
        
        System.out.println(base + " multiplied by " + height + " divided by 2 is: " + area);
    }
}