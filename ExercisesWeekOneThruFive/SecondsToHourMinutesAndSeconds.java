import java.util.Scanner;
 
public class SecondsToHourMinutesAndSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();
        input.close();
        System.out.println("Input seconds: " + seconds);
        
        int minutes = seconds / 60; 
        int hours = minutes / 60;

        minutes %= 60;
        seconds %= 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}