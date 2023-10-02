package Monday.QueueExercise;

interface QueueInterface {
  public void add(int value);

  public int remove (int index);

  public int peek();

  public boolean isEmpty();

  public int size();

  public void print();

  public void clear(int n);

  public void printReverse();

  public void jumpTheQueue(int n, int value);

  public String toString();

  public boolean equals(Queue queue);

  public int indexOf(int value);

  public int lastIndexOf(int value);
}
