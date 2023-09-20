public class SleepIn { 
    public static void main(String[] args) {        
        System.out.println(sleepIn(false, false));
    }
    
    public static boolean sleepIn(boolean weekDay, boolean vacation) {
        if (!weekDay || vacation) {
            return true;
        }
        return false;
    }
}