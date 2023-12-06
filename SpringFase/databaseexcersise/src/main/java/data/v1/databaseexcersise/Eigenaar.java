package data.v1.databaseexcersise;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "eigenaar")
public class Eigenaar {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  @OneToMany(mappedBy = "eigenaar")
  private Set<bedrijf> bedrijven;

  public Eigenaar() {}

  public Eigenaar(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<bedrijf> getBedrijven() {
    return bedrijven;
  }
}
