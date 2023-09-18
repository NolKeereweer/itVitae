public class Diff21 {
    public static void main(String[] args) {
        int n = 20;
        
        System.out.println("diff21(" + n + ") -> " + diff21(n));
    }    
    private static int diff21 (int n) {
        int diff= Math.abs(21 - n);
        return diff;
    }
}