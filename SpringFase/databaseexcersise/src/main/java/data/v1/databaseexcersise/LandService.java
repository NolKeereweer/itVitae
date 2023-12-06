package data.v1.databaseexcersise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LandService {
    @Autowired
    LandRepository landRepository;

    public Iterable<Land> getAllLand() {
        return landRepository.findAll();
    }

    public Land getById(Long id) {
        return landRepository.findById(id).get();
    }

    public Land maakTestLand() {
        Land land = new Land("China");
        return landRepository.save(land);
    }
}
