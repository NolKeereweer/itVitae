import java.util.Scanner;

public class ThursdayFinalAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt(); // Input

        if (number == 0) { // No bad! can't have 0
            System.out.println("Number can't be 0. Try again.");
            return;
        } else if (number <= 0) { // No bad! can't have negative input 
            System.out.println("No! Bad! Number can't be negative.\nTry again.\n");
            main(args); // A way to reset/recur... Do not type beat
        } else if (number >= 20) {
            System.out.println("Number is too high. Bye.");
            return;
        }

        try{ // Aaayeeee it works!!
            int start = 0;
            int start2 = 0;
            for (int i = 0; i <= number; i++) { // For loop to do math things
                if (i == 0) {
                    start = 2;
                    System.out.println(start); // if u put 1 you get 2.... Lucas numbers amirite?
                } else if (i == 1) {
                    start2 = 1;
                    System.out.println(start2); // if u put 2 you get 1.... Lucas numbers amirite?
                } else if (i % 2 == 0) {
                    start = start + start2;
                    System.out.println(start); // if u put anything higher than 2 and it is divisible by 2 you get something that works
                } else {
                    start2 = start2 + start;
                    System.out.println(start2); // if u put anything else you get something that works
                }
            }
        } catch (Exception e) { // No bad! you created an error. Now leave.           
            System.out.println("Not a usable number... Try again.");
            return;
        }
    }
}
