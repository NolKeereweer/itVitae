import java.math.*;
import java.util.*;

class BankAccount implements BankAccountInterface {

  private BigDecimal saldo;
  private ArrayList<BigDecimal> transactieLijst;

  public BankAccount() {
    this.saldo = BigDecimal.valueOf(0.000001);
    this.transactieLijst = new ArrayList<BigDecimal>(0);
  }
  
  //fields
  //methodes met body
  
  public void getTransactieHistorie() {
    System.out.println(this.transactieLijst);
  }
  
  public void getSaldo() {
    System.out.println(this.saldo);
  }
  
  public void storten(BigDecimal value) {
    this.saldo = this.saldo.add(value);
    TextMethodsWeekSeven.greenText();
    System.out.println(value + " succesfully deposited.");
    TextMethodsWeekSeven.resetText();
    this.transactieLijst.add(value);
  }
  
  public void overBoeken(BankAccount zender, BankAccount ontvanger, BigDecimal value) {
    BigDecimal tempOne = new BigDecimal(-1.0);
    BigDecimal tempTwo = value.multiply(tempOne);
    zender.saldo.subtract(value); 
    zender.transactieLijst.add(tempTwo);
    
    ontvanger.saldo.add(value);
    ontvanger.transactieLijst.add(value);
    TextMethodsWeekSeven.greenText();
    System.out.println("Succesfully transferred " + value);
    TextMethodsWeekSeven.resetText();
  }
}