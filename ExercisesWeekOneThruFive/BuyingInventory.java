import java.util.Scanner;
import java.util.ArrayList;

class BuyingInventory {
  public static void main(String[] args) {
    
    // ArrayList to store items
    ArrayList<String>items = new ArrayList<>(7);
    items.add("Rope");
    items.add("Torches");
    items.add("Climbing Equipment");
    items.add("Clean Water");
    items.add("Machete");
    items.add("Canoe");
    items.add("Food Supplies");
    
    // for-each loop to print out the catalogue
    int itemNumber = 0;    
    for (String itemName : items) {
      itemNumber++;      
      System.out.println(itemNumber + ". " + itemName);
    }
    
    // ArrayList to store item prices
    ArrayList<Integer>prices = new ArrayList<>(7);
    prices.add(10);
    prices.add(15);
    prices.add(25);
    prices.add(1);
    prices.add(20);
    prices.add(200);
    prices.add(1);
    
    Scanner input = new Scanner(System.in);    
    System.out.println("What item number do you want to see the price of? ");
    int requestedItem = input.nextInt();
    
    int requestedItemPrice = prices.get(requestedItem - 1); // int to determine which price to show    
    String requestedItemName = items.get(requestedItem - 1); // String to determine which item to show
    
    System.out.println(requestedItemName + " cost " + requestedItemPrice + " Gold");
  }
}