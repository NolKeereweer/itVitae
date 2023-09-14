import java.util.Scanner;
import java.util.ArrayList;

public class SleepIn { 
    public static void main(String[] args) {
        boolean sleepIn;
        
        Scanner input = new Scanner(System.in);
        System.out.println("What day is it?");
        String whatDay = input.next();
        System.out.println("Is it vacation? ");
        String vacation = input.next();        
        
        boolean vacationStatus;
        
        if (vacation.equals("Yes")) {
            vacationStatus = true;
        } else {
            vacationStatus = false;
        }
        
        ArrayList<String> workDays = new ArrayList<>();
        workDays.add("Monday");
        workDays.add("Tuesday");
        workDays.add("Wednesday");
        workDays.add("Thursday");
        workDays.add("Friday");
        
        boolean weekDay;
        
        if (whatDay.equals(workDays)) {
            weekDay = true;
        } else {
            weekDay = false;
        }
        
        if (weekDay == false || vacationStatus == true) {
            sleepIn = true;
        } else {
            sleepIn = false;
        }
        
        if (sleepIn = true) {
            System.out.println("Let's sleep in a little longer");
        } else {
            System.out.println("Wake up! You're gonna be late.");
        }
    }
}