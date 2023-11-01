class SwitchIf {
  public static void main(String[] args) {
    String browser = "Edge";
  
    switch (browser) {
      case "Edge":
        System.out.println("Je gebruikt Edge");
        break;
    
      case "Chrome", "Firefox", "Opera":
        System.out.println("Je gebruikt een moderne browser");
        break;
        
      case "IE":
        System.out.println("Bozo");
        break;
      
      default:
        System.out.println("Je gebruikt een niet ondersteunde browser");
    }
  }
}