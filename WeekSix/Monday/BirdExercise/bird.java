public abstract class bird {
  int wings;
  int weight; // in grams
  String colour;
  boolean canFly;
  
  public void setWings(int newWings) {
    this.weight = newWings;
  }

  public void setWeight(int newWeight) {
    this.weight = newWeight;
  }

  public void setColour(String newColour) {
    this.colour = newColour;
  }

  public void setFlyStatus(boolean newCanFly) {
    this.canFly = newCanFly;
  }

  public void birdPrinter() {
    System.out.println("This bird has " + wings + " wings and weighs " + weight + " grams");
  }
}