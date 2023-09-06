package PackageFolder.VehicleFolder;

public abstract class Vehicle {
    private int weight;
    private String colour;

    public void setWeight(int wgh) {
        weight = wgh;
    }

    public String getWeight() {
        return Integer.toString(weight);
    }

    public void setColour(String clr) {
        colour = clr;
    }

    public String getColour() {
        return colour;
    }

}
