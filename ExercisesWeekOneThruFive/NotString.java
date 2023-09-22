class NotString {
  public static void main(String[] args) {
    System.out.println(notString("Not what you were looking for.")); // calling the method notString and giving it a
                                                                     // string
    System.out.println(notString("at all."));                        // ''       ''
  }

  private static String notString(String a) { // create a method notString that recieves a string
    String subStringCheck = a.substring(0,3); // create a substring to use as a check to see if "Not" is within the indexes given
    String newString; // initialise a new string without allocating it any memory
    if (subStringCheck.equals("Not")) { // if statement to see if the substring equals "Not" if so just return the
                                        // original string
      return a;
    } else { // otherwise give the new string "Not " and return it
      newString = "Not " + a;
      return newString;
    }
  }
}
