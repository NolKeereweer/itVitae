public class Diff21 {
    public static void main(String[] args) {
        System.out.println(diff21(9));
        System.out.println(diff21(12));
        System.out.println(diff21(19));
    }    
    private static int diff21 (int n) {
        int diff= Math.abs(21 - n);
        return diff;
    }
}