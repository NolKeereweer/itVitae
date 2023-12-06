package data.v1.databaseexcersise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class EigenaarService {
  @Autowired
  EigenaarRepository eigenaarRepository;

  public Iterable<Eigenaar> getAllEigenaar() {
    return eigenaarRepository.findAll();
  }

  public Eigenaar maakTestEigenaar() {
    Eigenaar eigenaar = new Eigenaar("Sjon Dooh");
    return eigenaarRepository.save(eigenaar);
  }

  public Optional<Eigenaar> getById(Long id) {
    System.out.println("In service: getById");
    return eigenaarRepository.findById(id);
  }
}
