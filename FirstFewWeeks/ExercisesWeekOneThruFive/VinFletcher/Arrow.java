package VinFletcher;

public class Arrow {
  public static Arrow elite = new Arrow(HeadType.STEEL, FletchType.PLASTIC, 95);
  public static Arrow marksman = new Arrow(HeadType.STEEL, FletchType.GOOSE_FEATHERS, 65);
  public static Arrow beginner = new Arrow(HeadType.WOOD, FletchType.GOOSE_FEATHERS, 75);

  private HeadType headType;
  private FletchType fletchType;
  private int shaftLength;

  public Arrow(HeadType headType, FletchType fletchType, int shaftLength) {
    this.headType = headType;
    this.fletchType = fletchType;
    this.shaftLength = shaftLength;
  }

  public HeadType getHeadType() {
    return headType;
  }

  public FletchType getFletchType() {
    return fletchType;
  }

  public int getShaftLength() {
    return shaftLength;
  }

  public float getCost() {
    float headCost = 0.0f;
    float fletchCost = 0.0f;
    float shaftCost = (float) getShaftLength() * 0.05f;

    if (getHeadType() == HeadType.WOOD) {
      headCost = 3;
    } else if (getHeadType() == HeadType.OBSIDIAN) {
      headCost = 5;
    } else {
      headCost = 10;
    }

    if (getFletchType() == fletchType.GOOSE_FEATHERS) {
      fletchCost = 3;
    } else if (getFletchType() == fletchType.TURKEY_FEATHERS) {
      fletchCost = 5;
    } else {
      fletchCost = 10;
    }

    float totalCost = headCost + fletchCost + shaftCost;
    return totalCost;
  }
}
