import java.util.Scanner;
import java.util.ArrayList;

public class SleepIn { 
    public static void main(String[] args) {        
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
        } System.out.println(vacationStatus); // Diagnostic check
        
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
        } System.out.println(weekDay); // Diagnostic check
        
        boolean sleepIn;
        
        if (vacationStatus == true) { // Check if it either vacation and/or a workday
            sleepIn = true;
        } else if (weekDay == false) {
            sleepIn = true;
        } else {
            sleepIn = false;
        } System.out.println(sleepIn); // Diagnostic check
        
        if (sleepIn == true) { // Check if you can sleep in
            System.out.println("Let's sleep in a little longer");
        } else if (sleepIn == false) {
            System.out.println("Wake up! You're gonna be late.");
        }
    }
}