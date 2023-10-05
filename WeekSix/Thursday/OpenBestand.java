import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.awt.Toolkit;

public class OpenBestand{
  public static void main(String[] args) {
    try { 
      FileInputStream fis = new FileInputStream("test.txt");
    } catch (FileNotFoundException e) {
      System.out.println("No. Bad.");
      Toolkit.getDefaultToolkit().beep();
    }
  }
}