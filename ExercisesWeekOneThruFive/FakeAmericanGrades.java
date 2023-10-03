class FakeAmericanGrades {
  public static void main(String[] args) {
    /*80 and up = A
    60 and up = B
    50 and up = C
    45 and up = D
    25 and up = E
    default = F */
    
    int percentage = 0;
    char grade = ' ';
    
    Switch (percentage) {
      case 80: 
        grade = 'A';
        System.out.println("You got an " + grade);
        break;
        
      case 60 :
        grade = 'B';
        System.out.println("You got a " + grade);
        break;
        
      case > 50 && < 61 :
        grade = 'C';
        System.out.println("You got a " + grade);
        break;
        
      case > 45 && < 51 :
        grade = 'D';
        System.out.println("You got a " + grade);
        break;
        
      case > 25 && < 46 :
        grade = 'E';
        System.out.println("You got an " + grade);
        break;
      
      default :
        grade = 'F';
        System.out.println("You got an " + grade);
        break;
    }
  }
}