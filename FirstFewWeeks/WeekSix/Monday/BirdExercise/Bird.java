public abstract class Bird {
    private int wings = 0;
    private int weight = 0; // in grams
    private String color = null;
    private boolean canFly = false;

    protected Bird(int wings, int weight, String color, boolean canFly) {
        this.wings = wings;
        this.weight = weight;
        this.color = color;
        this.canFly = canFly;
    }

    public void birdPrinter() {
        System.out.println("This bird has " + wings + " wings and weighs " + weight + " grams");
    }
}