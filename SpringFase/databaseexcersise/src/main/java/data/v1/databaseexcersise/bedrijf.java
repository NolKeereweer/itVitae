package data.v1.databaseexcersise;


import jakarta.persistence.*;

@Entity
@Table(name = "bedrijf")
public class bedrijf {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String naam;
  private Integer aantalWerknemers;

  public String getNaam() {
    return naam;
  }

  public void setNaam(String naam) {
    this.naam = naam;
  }

  public Integer getAantalWerknemers() {
    return aantalWerknemers;
  }

  public void setAantalWerknemers(Integer aantalWerknemers) {
    this.aantalWerknemers = aantalWerknemers;
  }

  public bedrijf(String naam, Integer aantalWerknemers) {
    setNaam(naam);
    setAantalWerknemers(aantalWerknemers);
  }

  public bedrijf(){}
}
