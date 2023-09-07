import java.util.Scanner;

public class Thursday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What temperature is it currently?");

        double temperatureFahrenheit = input.nextDouble();

        System.out.println(temperatureFahrenheit + "? Oh sorry I don't speak cheeseburger per football field...");
        
        input.close();
        
        double temperatureCelsius = (temperatureFahrenheit - 32) / 1.8;

        System.out.println("It is currently: " + temperatureCelsius + " degrees Centigrade.");       
    }    
}
