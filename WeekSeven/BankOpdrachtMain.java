import java.util.Scanner;
import java.math.*;
import java.util.*;

public class BankOpdrachtMain {
  public static Scanner input = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    Client test = new Client("Henk", "9-9-1999", "Henkstraat", 9);
    Client testTwo = new Client("Sjaak", "10-10-2000", "Sjaakstraat", 1);
    
    for (int i = 0; i <= 3; i++) {
      System.out.print("""
        Options for this client:
      - Press 1 to show client information.
      - Press 2 to show client balance.
      - Press 3 to show client's transaction history.
      - Press 4 to enter the deposit menu.
      - Press 5 to enter the transfer menu.
        
      """);
      
      System.out.print("-");
      int menuInput = input.nextInt();
      System.out.println();
      
      boolean retry = false;
      do {
        switch (menuInput) {
          case 1: 
            test.getKlantInfo(); 
            break;
            
          case 2: 
            test.rekening.getSaldo(); 
            break;
            
          case 3: 
            test.rekening.getTransactieHistorie();
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
                test.rekening.overBoeken(test.rekening, testTwo.rekening, transferAmount);
                break;
              case 2: 
                test.rekening.overBoeken(testTwo.rekening, test.rekening, transferAmount);
                break;
              default:
                System.out.println("That order won't work.");
                break;
            }
            break;
            
          default:
            TextMethodsWeekSeven.redText();
            System.out.println("Not a viable input. Try again.");
            TextMethodsWeekSeven.resetText();
            retry = true;
        }
      } while (retry);
    }     
  }
}