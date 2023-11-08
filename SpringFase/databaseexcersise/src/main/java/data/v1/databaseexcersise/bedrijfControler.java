package data.v1.databaseexcersise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/bedrijf")
public class bedrijfControler {
  @Autowired
  BedrijfService bedrijfService;

  @GetMapping("/findall")
  public Iterable<bedrijf> findAll() {
    System.out.println("findAll endpoint aangeroepen");
    return bedrijfService.getAllBedrijf();
  }

  @GetMapping("/test")
  public void maakTestBedrijf() {
    bedrijfService.maakTestBedrijf();
    System.out.println("maakTestBedrijf endpoint aangeroepen");
  }

  @GetMapping("/id/{id}")
  public Optional<bedrijf> getBedrijfById(@PathVariable(value="id") Long id) {
    System.out.println("In endpoint: getBedrijfById met ID: " + id);
    return bedrijfService.getById(id);
  }

  @PostMapping("/new")
  public bedrijf addBedrijf(@RequestBody bedrijf newbedrijf) {
    System.out.println("In endpoint: addBedrijf");
    return bedrijfService.addBedrijf(newbedrijf);
  }
}