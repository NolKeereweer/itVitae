import java.util.Scanner;

class ExerciseTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many estates, duchies and provinces do yee possess?");
        
        int estatePoints = input.nextInt();
        
        final int pointsPerDuchy = 3;
        
        int duchyPoints = input.nextInt() * pointsPerDuchy;
        
        final int pointsPerProvince = 6;
        
        int provincePoints = input.nextInt() * pointsPerProvince;
        
        int pointTotal = estatePoints + duchyPoints + provincePoints;
        
        System.out.println("Your points total is: " + pointTotal + " Sire.");
    }
}