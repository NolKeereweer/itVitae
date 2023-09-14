import java.util.Scanner;

public class ThursdayAssignmentOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your base: ");
        
        int base = input.nextInt();

        System.out.print("Enter your exponentary value: ");

        int exp = input.nextInt();

        System.out.println(base + " To the power of " + exp + " is " + exponent(base, exp));

        System.out.println("Enter a number to see if it's odd: ");

        int isItOdd = input.nextInt();

        System.out.println(isOdd(isItOdd));
    }

    public static int exponent(int base, int exp) {
        return (int) Math.pow(base, exp);
    }

    public static boolean isOdd(int isItOdd) {
        return isItOdd % 2 != 0;
    }
}