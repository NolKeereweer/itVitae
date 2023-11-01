class NotString {
  public static void main(String[] args) {
    System.out.println(notString("not what you were looking for.")); // calling the method notString and giving it a
                                                                     // string
    System.out.println(notString("at all."));                        // ''       ''
  }

  private static String notString(String a) { // create a method notString that recieves a string
    if (a.startsWith("not")) { 
      return a;
    } else { // otherwise give the new string "Not " and return it
      String newString = "not " + a;
      return newString;
    }
  }
}
