package PackageFolder.CarFolder;

import PackageFolder.VehicleFolder.Vehicle;

public class Car extends Vehicle {
    String make;
    String model;
    int topSpeed;
    int registrationDate;
    String licensePlate;
    
    public Car(String mk, String md, int wgh, int tsp, String clr, int regd, String lsp) {
        make = mk;
        model = md;
        super.setWeight(wgh);
        topSpeed = tsp;
        super.setColour(clr);
        registrationDate = regd;
        licensePlate = lsp;
    }

    public String getInfo() {
        return "Car information:\nMake of car: " + make + "\nModel of car: " + model 
            + "\nCar has a topspeed of: " + topSpeed + "kph\nRegistration info:\nRegistration Date is " 
            + registrationDate + "\nLicense plate is " + licensePlate;
    }
}
