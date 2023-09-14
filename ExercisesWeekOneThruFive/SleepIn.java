import java.util.Scanner;

public class SleepIn { 
    public static void main(String[] args) {
        boolean sleepIn;
        
        Scanner input = new Scanner(System.in);
        System.out.println("What day is it?");
        String whatDay = input.next();
        System.out.print("Is it vacation? ");
        String vacation = input.next();
        
        boolean weekDay;
        
        boolean vacationStatus;
        
        if (vacation.equals("Yes")) {
            vacationStatus = true;
        } else {
            vacationStatus = false;
        }
        
        if (whatDay.equals("Monday")) {
            weekDay = true;
        }
        
        if () {
            
        }
        
        System.out.println(sleepIn);
    }
}