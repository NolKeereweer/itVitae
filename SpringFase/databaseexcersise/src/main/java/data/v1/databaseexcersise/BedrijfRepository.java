package data.v1.databaseexcersise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface BedrijfRepository extends JpaRepository <bedrijf, Long> {

}
