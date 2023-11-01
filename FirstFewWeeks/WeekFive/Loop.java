class Loop {
  public static void main(String[] args) {
    int[] intArray = new int[5];
    int i = 0;
    
    while (i < intArray.length) {
      intArray [i] = i + 2;
      i++;
      System.out.println(i);
    }
    
    i = 0;
    do {
      intArray [i] = i + 2;
      i++;
      System.out.println(i);
    } while (i < intArray.length);
  }
}