package Monday.QueueExercise;

public class QueueMain {
  public static void main(String[] args) {
      Queue lijst = new Queue();
      Queue lijst2 = new Queue();
      lijst.add(0);
      lijst.print();
      lijst2.add(0);
      lijst.equals(lijst2);
  }
}
