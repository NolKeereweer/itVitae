import java.util.Scanner;

public class ExerciseFourOptTwo {
	public static void main(String[] args) {
		Scanner inputName = new Scanner(System.in);		
		
		System.out.println("Bread is ready\nWho is the bread for?");
		
		String name = inputName.next();
		
		inputName.close();
		
		System.out.println("Noted: " + name + " got bread.");
	}
} 