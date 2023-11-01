class FakeAmericanGrades {
  public static void main(String[] args) {
    char grade = ' ';
    int percentage = 9;

    if (percentage > 80) {
      grade = 'A';
      System.out.println("You got an " + grade);
    } else if (percentage > 60 && percentage < 81) {
        grade = 'B';
        System.out.println("You got a " + grade);
    } else if (percentage > 50 && percentage < 61) {
        grade = 'C';
        System.out.println("You got a " + grade);
    } else if (percentage > 45 && percentage < 51) {
        grade = 'D';
        System.out.println("You got a " + grade);
    } else if (percentage > 25 && percentage < 46) {
        grade = 'E';
        System.out.println("You got an " + grade);
    } else {
        grade = 'F';
        System.out.println("You got an " + grade);
    }

    /*80 and up = A
    60 and up = B
    50 and up = C
    45 and up = D
    25 and up = E
    default = F */

    /*char grade = ' ';
    final int percentage = 0;    
    switch (percentage) {
      case 100:

      // and so on

      case 86:
      case 85:
      case 84:
      case 83:
      case 82:
      case 81: 
        grade = 'A';
        System.out.println("You got an " + grade);
        break;
        
      	// and so on

      case 63:
      case 62:
      case 61 :
        grade = 'B';
        System.out.println("You got a " + grade);
        break;
        
        // fall through

      case 50 :
        grade = 'C';
        System.out.println("You got a " + grade);
        break;        
      
        // fall through

      case 45 :
        grade = 'D';
        System.out.println("You got a " + grade);
        break; 
        
        // fall through

      case 25:
        grade = 'E';
        System.out.println("You got an " + grade);
        break;

      default:
        grade = 'F';
        System.out.println("You got an " + grade);
        break;
    }*/
  }
}