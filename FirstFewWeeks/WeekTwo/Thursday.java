import java.util.Scanner;

public class Thursday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter distance in meters:");

        double distanceInMeters = input.nextDouble();

        System.out.println("Enter hours:");

        double timeHours = input.nextDouble();

        System.out.println("Enter minutes:");

        double timeMinutes = input.nextDouble();

        System.out.println("Enter seconds:");

        double timeSeconds = input.nextDouble();

        System.out.println("Calculating...");
        
        input.close(); // everything above this line is for user input: meters and time

        double distanceInMiles = distanceInMeters / 1609; // converting meters to miles

        double totalTimeInSeconds = timeSeconds + (timeMinutes * 60) + (timeHours * 60 * 60); // coverting hours and minutes into seconds
        
        double totalTimeInHours =  timeHours + (timeMinutes / 60) + (timeSeconds / 60 / 60); // converting minutes and seconds into hours
        
        double speedMetersSeconds = distanceInMeters / totalTimeInSeconds; // calculating speed in meters per seconds

        double speedKilometersHours = speedMetersSeconds * 3.6; // calculating speed in kilometers per hour

        double speedMilesHours = distanceInMiles / totalTimeInHours; // calculating speed in miles per hour

        System.out.println("You have travelled a distance of: " + distanceInMiles + " miles at a speed of:\n");
        System.out.println(speedMetersSeconds + " m/s\n" + speedKilometersHours + " km/h\n" + 
                           speedMilesHours + " Mph"); // final print statement, shows speed in all 3 measurements + distance in miles
    }    
}
