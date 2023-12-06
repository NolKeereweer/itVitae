package data.v1.databaseexcersise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface LandRepository extends JpaRepository<Land, Long> {

}
