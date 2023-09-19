public class SleepIn { 
    public static void main(String[] args) {        
        System.out.println(sleepIn(false, false));
    }
    
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        }
        return false;
    }

}