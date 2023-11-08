package data.v1.databaseexcersise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class BedrijfService {
  @Autowired
  BedrijfRepository bedrijfRepository;

  public Iterable<bedrijf> getAllBedrijf() {
    System.out.println("in service: getAllBedrijf");
    return bedrijfRepository.findAll();
  }

  public bedrijf maakTestBedrijf() {
    bedrijf testBedrijf = new bedrijf("Cool Bedrijf en zn.", 5);
    System.out.println();
    return bedrijfRepository.save(testBedrijf);
  }

  public Optional<bedrijf> getById(Long id) {
    System.out.println("In service: getById");
    return bedrijfRepository.findById(id);
  }

  public bedrijf addBedrijf(bedrijf newbedrijf) {
    System.out.println("In service: addBedrijf");
    return bedrijfRepository.save(newbedrijf);
  }
}
