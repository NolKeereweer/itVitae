package data.v1.databaseexcersise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/eigenaar")
public class EigenaarController {
  @Autowired
  EigenaarService eigenaarService;

  @GetMapping("/findall")
  public Iterable<Eigenaar> findAll() {
    return eigenaarService.getAllEigenaar();
  }

  @GetMapping("/test")
  public void maakTestEigenaar() {
    eigenaarService.maakTestEigenaar();
  }
}
