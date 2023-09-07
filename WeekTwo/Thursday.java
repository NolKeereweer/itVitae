import java.math.*;
import java.util.Scanner;

public class Thursday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("insert year count:");

        long years = input.nextInt();
        
        System.out.println(Long.toUnsignedString(years * 60L * 365L * 24L));
        input.close();
    }
    
}
