import java.util.Scanner;

public class Diff21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println(diff21(n));
    }    
    private static int diff21 (int n) {
        int diff;
        if (n <= 21) {
            diff = Math.abs(21 - n);
            System.out.print("Difference = ");
            return diff;
        } else {
            diff = Math.abs((21 - n) * 2);
            System.out.print("Difference = ");
            return diff;
        }
    }
}