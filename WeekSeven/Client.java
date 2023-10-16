class Client implements ClientInterface {
  
  private String naam;
  private String geboorteDatum;
  private String straatNaam;
  private int huisNummer;
  BankAccount rekening;
  
  public Client(String naam, String geboorteDatum, String straatNaam, int huisNummer) {
    this.rekening = new BankAccount();
    setNaam(naam);
    setGeboorteDatum(geboorteDatum);
    setStraatNaam(straatNaam);
    setHuisNummer(huisNummer);
  }
  
  public void setNaam(String naam) {
    this.naam = naam;
  }
  
  public void setGeboorteDatum(String geboorteDatum) {
    this.geboorteDatum = geboorteDatum;
  }
  
  public void setStraatNaam(String straatNaam) {
    this.straatNaam = straatNaam;
  }
  
  public void setHuisNummer(int huisNummer) {
    this.huisNummer = huisNummer;
  }
  
  public void getKlantInfo() {
    System.out.println(this.naam + " " + this.geboorteDatum + " " + this.straatNaam + " " + this.huisNummer);
  }
}