import java.util.Scanner;

public class MondayChapterTwoEnd {
    public static void main(String[] args) {
        int even = 0; // variables to be used later, these become the sums of even/uneven numbers
        int unEven = 0;
        
        Scanner input = new Scanner(System.in); // open a scanner called input

        System.out.println("Enter a whole possitive number: ");
        
        int number = input.nextInt(); // stores the input number

        input.close(); // closes the input

        for (int i = 1; i <= number; i++) { // for loop to cycle all numbers until input number is matched
            if (i % 2 == 0) {
                even += i; // summarise all even numbers before input number
            } else {
                unEven += i; // summarise all uneven numbers before input number
            }
        }

        int difference = Math.abs(even - unEven); // store the difference between the sums, Math.abs makes it absolute

        System.out.println("Tally of even numbers: " + even);
        System.out.println("Tally of uneven numbers: " + unEven); // final print statements
        System.out.println("Difference between the tallies is: " + difference);
    }
}
