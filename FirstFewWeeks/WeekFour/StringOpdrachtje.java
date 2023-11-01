class StringOpdracthje {
  public static void main(String[] args) {
    String text = "ayodude";
    String newText = "";
    char posChar;
    
    System.out.println(text);
    
    for (int i = 0; i < text.length(); i++) {
      posChar = text.charAt(i);
      newText = posChar + newText;
    }
    
    System.out.println(newText);
    
    StringBuilder test = new StringBuilder("reverse this sentence bozo");
    System.out.println(new String(test.reverse()));
  }
}