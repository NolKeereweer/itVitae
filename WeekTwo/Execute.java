import java.util.Scanner; // Unused in current version, to be implemented soon
import PackageFolder.CarFolder.Car;
import PackageFolder.VehicleFolder.Vehicle;

public class Execute {
    public static void main(String[] args) {
        Car firstCar = new Car("BMW", "M3", 3000, 250, "Black", 22052002, "X-666-XX");

        Car secondCar = new Car("BMW", "Z4", 1256, 256, "Blue", 22052006, "N-101-XD");

        System.out.println(firstCar.getInfo());

        System.out.println("------------------------------------------------------------------------------------");

        System.out.println(secondCar.getInfo());
    }
}