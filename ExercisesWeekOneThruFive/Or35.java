public class Or35 {
    public static void main(String[] args) {
        System.out.println(or35(5));
        System.out.println(or35(10));
        System.out.println(or35(7));
    }
    
    private static boolean or35(int numbers) {
        return (numbers % 3 == 0) || (numbers % 5 == 0);
    }
}