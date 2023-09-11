package WeekThree;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class CoensAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the codes:");

        int a = input.nextInt();
        int b = input.nextInt();
        input.close();

        int c = a ^ b;

        String binString = Integer.toBinaryString(c); 
        ArrayList<String> lijst = new ArrayList<>(Arrays.asList(binString));
        Collections.shuffle(lijst);
        String shuffledList = String.join("", lijst);

        int endNumber = Integer.parseInt(shuffledList, 2);

        boolean zelfde = (endNumber ^ b) == (endNumber ^ a);

        int aNew = endNumber ^ a;
        int bNew = endNumber ^ b;

        System.out.println("Result: " + zelfde + "\nYour data: " + aNew + " " + bNew);
    }
}