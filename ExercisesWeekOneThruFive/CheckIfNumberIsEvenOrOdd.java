import java.util.Scanner;

public class CheckIfNumberIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // opens a scanner
        System.out.print("Input a number: "); // prints a question
        int inputNumber = input.nextInt(); // declare the input integer
        
        if (inputNumber % 2 == 0) { // if statement to check whether the input integer is even or odd
            System.out.println(1); // outcome if it's even/'true'
        } else {
            System.out.println(0); // outcome if it's odd/'false'
        }
    }
}