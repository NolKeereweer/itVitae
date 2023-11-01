class TimesTable {
  public static void main(String[] args) {
    int size = 10;
    
    System.out.print(" * | ");
    for (int i = 1; i <= size; i++) {
      System.out.print(i + " ");
    }
    
    System.out.print("\n___");
    
    for (int i = 0; i <= size; i++) {
      System.out.print("___");
    }
    
    System.out.println();
    
    for (int x = 1; x <= size; x++) {
      if (x < size) {
      System.out.print(" " + x + " | ");
      } else {
        System.out.print(x + " | ");
      }
      for (int y = 1; y <= size; y++) {
        System.out.print((x * y) + " ");
        if (y == size) {
          System.out.println();
        }
      }
    }
  }
}