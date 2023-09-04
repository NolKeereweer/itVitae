import java.text.ParseException;
import java.util.Scanner;
import PackageFolder.CarFolder.Car;

public class Execute {
    public static void main(String[] args) throws ParseException {
        Car firstCar = new Car("BMW", "M3", 3000, 250, "Black", "22/05/2002", "X-666-XX");

        Car secondCar = new Car("BMW", "Z4", 1256, 256, "Blue", "22/05/2006", "N-101-XD");

        System.out.println(firstCar.getInfo());
        System.out.println(firstCar.getWeight() + " kgs");
        System.out.println("Painted: " + firstCar.getColour());

        System.out.println("------------------------------------------------------------------------------------");

        System.out.println(secondCar.getInfo());
        System.out.println(secondCar.getWeight() + " kgs");
        System.out.println("Painted: " + secondCar.getColour());

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("License plate checker, enter corresponding number:");

        Scanner inputOne = new Scanner(System.in);

        int which = inputOne.nextInt();

        inputOne.close();

        if (which == 1) {
            System.out.println(firstCar.getLicense());
        } else {
            System.out.println(secondCar.getLicense());
        }

    }
}