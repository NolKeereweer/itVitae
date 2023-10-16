import java.math.*;
import java.util.*;

interface BankAccountInterface {
  
  void getTransactieHistorie();
  void getSaldo();
  void storten(BigDecimal value);
  void overBoeken(BankAccount zender, BankAccount ontvanger, BigDecimal value);
}