import java.util.Scanner;

public class ThursdayAssignmentOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Opens a scanner to gather user input

        System.out.print("Enter your base: "); // First print line
        int base = input.nextInt(); // First user input
        System.out.print("Enter your exponentary value: "); // Second print line
        int exp = input.nextInt(); // Second user input
        System.out.println(base + " To the power of " + exp + " is " + exponent(base, exp)); /*
           Final print statement that calls the exponent method to power the first and second inputs and print the answer
        */

        //------------------------------------------------------------------------------------------------------------------------//

        System.out.println("Enter a number to see if it's odd: "); // Print line second exercise to gather number
        int isItOdd = input.nextInt(); // Input to gather number
        System.out.println(isOdd(isItOdd)); // Print statement that calls the isOdd method and print the answer
    }

    public static int exponent(int base, int exp) { // Method to power integers base and exp
        return (int) Math.pow(base, exp); // Cast an int from a double, power the ints, immediatly returns answer
    }

    public static boolean isOdd(int isItOdd) { // Method to check if int is odd
        return isItOdd % 2 != 0; // Turning an int into a boolean by way of modulo is not 0, immediatly returns answer
    }
}