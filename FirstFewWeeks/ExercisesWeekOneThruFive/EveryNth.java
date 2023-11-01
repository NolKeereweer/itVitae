class EveryNth {
  public static void main(String[] args) {
    System.out.println(everyNth("Miracle", 2));
    System.out.println(everyNth("abcdefg", 2));
    System.out.println(everyNth("abcdefg", 3));
  }
  
  private static String everyNth(String str, int N) {
    String charsAtN = "";
    for (int i = 0; i <= str.length(); i++) {
      if (i % N == 0) {
        charsAtN = charsAtN + str.charAt(i);
      }
    } 
    return charsAtN;
  }
}