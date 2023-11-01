import java.util.Scanner;
import java.math.*;
import java.util.*;

public class BankOpdrachtMain {
  public static Scanner input = new Scanner(System.in);
  
  private static Client test = new Client("Henk", "9-9-1999", "Henkstraat", 9);
  private static Client testTwo = new Client("Sjaak", "10-10-2000", "Sjaakstraat", 1);
  
  public static void main(String[] args) {
    System.out.println("Welcome to the ITVitae student bank.\nRunning admin menu now.\n");
    adminMenu();
  }

  private static void adminMenu() {
    boolean runAdminMenu = true;
    do {
      System.out.println("Enter admin command number (For help enter 3): ");      
      int clientInput = input.nextInt();      

      
      switch (clientInput) {
        case 1: 
          System.out.println("Opening client menu for client number " + clientInput + "\n...\n...\n...");
          clientMenu(test);
          break;
        case 2:
          System.out.println("Opening client menu for client number " + clientInput + "\n...\n...\n...");
          clientMenu(testTwo);
          break;
        case 3:
          System.out.print("""
          
            Admin command list:
          - 1 run client menu for client number 1
          - 2 run client menu for client number 2
          - 3 show command list
          - 4 exit command menu
          
          """);
          break;
        case 4:
          System.out.println("Exiting admin menu. Closing program.");
          runAdminMenu = false;
          break;
        default:
          System.out.println("Not a viable input. Try again.");
          break;
      }
    } while (runAdminMenu);
  }

  public static void clientMenu(Client current) {
    boolean runClientMenu = true;
    while (runClientMenu) {
      System.out.print("""
      
        Options for this client:
      - Press 1 to show client information.
      - Press 2 to show client balance.
      - Press 3 to show client's transaction history.
      - Press 4 to enter the deposit menu.
      - Press 5 to enter the transfer menu.
      - Press 6 to exit.
        
      """);
      
      System.out.print("-");
      int menuInput = input.nextInt();
      System.out.println();
      
      boolean retry = false;
      do {
        switch (menuInput) {
          case 1: 
            current.getKlantInfo(); 
            break;
            
          case 2: 
            current.rekening.getSaldo(); 
            break;
            
          case 3: 
            current.rekening.getTransactieHistorie();
            break;
            
          case 4:
            System.out.println("How much would you like to deposit?");
            BigDecimal depositInput = new BigDecimal(input.nextDouble());
            test.rekening.storten(depositInput);
            break;
            
          case 5:
            System.out.println("How much would you like to transfer?");
            BigDecimal transferAmount = new BigDecimal(input.nextDouble());
            
            System.out.print("""
            In what order do you want the money to be transfered?
            - 1 test to testTwo
            - 2 testTwo to test
            """);
            
            int senderInput = input.nextInt();
            
            switch (senderInput) {
              case 1:
                current.rekening.overBoeken(current.rekening, testTwo.rekening, transferAmount);
                break;
              case 2: 
                current.rekening.overBoeken(testTwo.rekening, current.rekening, transferAmount);
                break;
              default:
                System.out.println("That order won't work.");
                break;
            }
            break;
            
          case 6:
            System.out.println("Exiting client menu.");
            runClientMenu = false;
            break;
            
          default:
            TextMethodsWeekSeven.redText();
            System.out.println("Not a viable input. Try again.");
            TextMethodsWeekSeven.resetText();
            break;
        }
      } while (retry);
    }
  }
}