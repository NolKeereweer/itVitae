package data.v1.databaseexcersise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.*;

import java.util.Optional;
import java.util.Set;

@RestController
@CrossOrigin
@RequestMapping("/api/bedrijf")
public class bedrijfControler {
  @Autowired
  BedrijfService bedrijfService;

  @Autowired
  BedrijfRepository bedrijfRepository;

  @Autowired
  EigenaarService eigenaarService;

  @GetMapping("/findall")
  public Iterable<bedrijf> findAll(Pageable pageable) {
    System.out.println("findAll endpoint aangeroepen");
    return bedrijfRepository.findAll(
            PageRequest.of(
                    pageable.getPageNumber(),
                    Math.min(pageable.getPageSize(), 3)
                    , pageable.getSortOr(Sort.by(new Sort.Order(Sort.Direction.ASC, "id")))));
  }

  @GetMapping("/test")
  public void maakTestBedrijf() {
    bedrijfService.maakTestBedrijf();
    System.out.println("maakTestBedrijf endpoint aangeroepen");
  }

  @PostMapping("/new/{eig_id}")
  public bedrijf addBedrijf(@PathVariable (value = "eig_id") Long eigId, @RequestBody bedrijf newbedrijf) {
    Eigenaar eigenaar = eigenaarService.getById(eigId).get();
    newbedrijf.setEigenaar(eigenaar);
    System.out.println("In endpoint: addBedrijf");
    return bedrijfService.addBedrijf(newbedrijf);
  }

  @GetMapping("/id/{id}")
  public Optional<bedrijf> getBedrijfById(@PathVariable(value="id") Long id) {
    System.out.println("In endpoint: getBedrijfById met ID: " + id);
    return bedrijfService.getById(id);
  }

  @GetMapping("/byname/{name}")
  public Set<bedrijf> findByName(@PathVariable(value="name") String name) {
    System.out.println();
    return bedrijfRepository.findByName(name);
  }
}