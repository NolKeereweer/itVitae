package data.v1.databaseexcersise;


import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "bedrijf")
public class bedrijf {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Integer aantalWerknemers;

  @ManyToOne
  @JoinColumn(name="eigenaar_id", nullable = false)
  private Eigenaar eigenaar;

  @ManyToMany(mappedBy = "bedrijven")
  private Set<Land> landen = new HashSet<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAantalWerknemers() {
    return aantalWerknemers;
  }

  public void setAantalWerknemers(Integer aantalWerknemers) {
    this.aantalWerknemers = aantalWerknemers;
  }

  public bedrijf(String name, Integer aantalWerknemers) {
    setName(name);
    setAantalWerknemers(aantalWerknemers);
  }

  public void setEigenaar(Eigenaar eigenaar) {
    this.eigenaar = eigenaar;
  }

  public Set<Land> getLanden() {
    return this.landen;
  }

  public void addLand(Land land) {
    this.landen.add(land);
    land.getBedrijven().add(this);
  }

  public bedrijf(){}
}
