import java.util.Scanner;

public class Diff21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(diff21(n));
    }    
    private static int diff21 (int n) {
        int diff= Math.abs(21 - n);
        System.out.print("Difference = ");
        return diff;
    }
}