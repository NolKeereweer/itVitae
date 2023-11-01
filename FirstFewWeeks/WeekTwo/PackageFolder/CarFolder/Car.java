package PackageFolder.CarFolder;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import PackageFolder.VehicleFolder.Vehicle;

public class Car extends Vehicle {
    String make;
    String model;
    int topSpeed;
    Date registrationDate;
    String licensePlate;

    public Car(String mk, String md, int wgh, int tsp, String clr, String regd, String lsp) throws ParseException {
        make = mk;
        model = md;
        super.setWeight(wgh);
        topSpeed = tsp;
        super.setColour(clr);
        registrationDate = new SimpleDateFormat("dd/MM/yyyy").parse(regd);  
        licensePlate = lsp;
        super.getWeight();
        super.getColour();
    }

    public String getInfo() {
        return "Car information:\nMake of car: " + make + "\nModel of car: " + model
                + "\nCar has a topspeed of: " + topSpeed + "kph\nRegistration info:\nRegistration Date is "
                + registrationDate + "\nLicense plate is " + licensePlate;
    }

    public String getLicense() {
        return licensePlate;
    }
}
