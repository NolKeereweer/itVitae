package data.v1.databaseexcersise;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="land")
public class Land {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String naam;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
        name = "land_bedrijf",
        joinColumns = { @JoinColumn(name = "land_id")},
        inverseJoinColumns = {@JoinColumn(name = "bedrijf_id")}
    )
    @JsonBackReference
    private Set<bedrijf> bedrijven = new HashSet<>();

    public Land(String naam) {
        this.naam = naam;
    }

    public Land(){}

    public String getNaam() {
        return this.naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setBedrijven(Set<bedrijf> bedrijven) {
        this.bedrijven = bedrijven;
    }

    public Set<bedrijf> getBedrijven() {
        return this.bedrijven;
    }
}
