import java.util.Scanner;
/* 
 * Imported the Scanner package, The program uses 2 inputs to finish a println statement
 */
public class ExerciseFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // initiated a scanner called input

        System.out.println("What kind of thing are we talking about?");


        String noun = input.nextLine(); // nextLine reads whole line to create noun(the namer)
        String[] words = noun.split(" "); // splits noun into seperate words
        String a = words[words.length - 1]; // grabs words, length -1 = sum words -1

        System.out.println("How would you describe it? Big? Azure? Tattered?");

        String b = input.next(); // declare string b is a user input as well

        String c = " Of Doom"; // declaring the 2 hardcoded strings to complete the story
        String d = "3000";

        System.out.println("The " + b + " " + a + c + " " + d + "!");
    }
}