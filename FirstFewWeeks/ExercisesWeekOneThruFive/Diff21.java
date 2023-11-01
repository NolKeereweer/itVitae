import java.util.Scanner;

public class Diff21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Difference is = " + diff21(n));
    }    
    private static int diff21 (int n) {
        int diffCalculator = 21 - n;
        if (n <= 21) {
          return diffCalculator;
        } 
        else {
          return Math.abs(diffCalculator * 2);
        }
    }
}