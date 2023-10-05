import java.util.Scanner;
import java.util.ArrayList;

class BuyingInventory {
  
  private static final String ANSI_GREEN = "\u001B[32m"; // change text color to green
  private static final String ANSI_RED = "\u001B[31m"; // change the text color to red
  private static final String ANSI_RESET = "\u001B[0m"; // reset text color

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
    ArrayList<Double>prices = new ArrayList<>(7);
    prices.add(10.0);
    prices.add(15.0);
    prices.add(25.0);
    prices.add(1.0);
    prices.add(20.0);
    prices.add(200.0);
    prices.add(1.0);

    // ArrayList to store discounted prices
    ArrayList<Double>discountedPrices = new ArrayList<>(7);
    discountedPrices.add(5.0);
    discountedPrices.add(7.5);
    discountedPrices.add(12.5);
    discountedPrices.add(0.5);
    discountedPrices.add(10.0);
    discountedPrices.add(100.0);
    discountedPrices.add(0.5);

    Scanner input = new Scanner(System.in);
    System.out.println("What's your name?");
    String customerName = input.nextLine().toLowerCase();
    System.out.println(); // white line in executed code
    boolean discount = false;
    if (customerName.equals("nol") || customerName.equals("tommie")) {
      discount = true;
      System.out.println(ANSI_GREEN + "Discount granted!" + ANSI_RESET);
    }
    
    int requestedItem;
    
    do  {
      System.out.println("What item number do you want to see the price of? ");
      requestedItem = input.nextInt();
      if (requestedItem > 7) {
        System.out.println(ANSI_RED + "That isn't part of our inventory." + ANSI_RESET + " It's best you try again.\n" );
      }
    } while (requestedItem > 7);
    
    String requestedItemName = items.get(requestedItem - 1); // String to determine which item to show
    
    double requestedItemPrice;
    if (!discount) { // if statement to determine which price to show
      requestedItemPrice = prices.get(requestedItem - 1);
    } else {
      requestedItemPrice = discountedPrices.get(requestedItem - 1);
    } 
    
    System.out.println(requestedItemName + " cost " + requestedItemPrice + " Gold");
  }
}