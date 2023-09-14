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
        
        if (vacation.equals("Yes")) { // check if it is vacation or not
            vacationStatus = true;
        } else {
            vacationStatus = false;
        }
        
        ArrayList<String> workDays = new ArrayList<>(); // Creat a list with possible days to work/go to school on
        workDays.add("Monday");
        workDays.add("Tuesday");
        workDays.add("Wednesday");
        workDays.add("Thursday");
        workDays.add("Friday");
        
        boolean weekDay;
        
        if (whatDay.equals(workDays)) { // Check if it is a workday
            weekDay = true;
        } else {
            weekDay = false;
        }
        
        if (weekDay == false && vacationStatus == false) { // Check if it either vacation and/or a workday
            sleepIn = false;
        } else if (weekDay == true && vacationStatus == true) {
            sleepIn = true;
        } else if (weekDay == true && vacationStatus == false) {
            sleepIn = false;
        } else {
            sleepIn = true;
        }
        
        if (sleepIn == true) { // Check if you can sleep in
            System.out.println("Let's sleep in a little longer");
        } else {
            System.out.println("Wake up! You're gonna be late.");
        }
    }
}