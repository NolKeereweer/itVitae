import java.util.Scanner;

class Watchtower {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 2 numbers:");
    int x = input.nextInt();
    int y = input.nextInt();
    
    direction(x, y);
  }
  
  private static void direction(int x, int y) {
    String yDirection = "";
    String xDirection = "";
    
    if (y > 0) {
      yDirection = "north";
    } else if (y < 0) {
      yDirection = "south";
    } 
    
    if (x > 0) {
      xDirection = "east";
    } else {
      xDirection = "west";
    }
    
    String endDirection = "";
    if (y == 0 && x == 0) {
      endDirection = "The enemy is here!";
    } else {
      endDirection = "The enemy is to the " + yDirection + xDirection;
    }
    
    System.out.println(endDirection);
  }
}