package data.v1.databaseexcersise;

import data.v1.databaseexcersise.bedrijf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/land")
public class LandController {
    @Autowired
    LandService landService;
    @Autowired
    BedrijfService bedrijfService;

    @GetMapping("/findall")
    public Iterable<Land> findAll() {
        return landService.getAllLand();
    }

    @GetMapping("/test")
    public void maakTestLand() {
        landService.maakTestLand();
    }

    @GetMapping("/addland/{bedrijf_id}/{land_id}")
    public void addLand(@PathVariable(value = "bedrijf_id") Long bedrijf_id, @PathVariable(value = "land_id") Long land_id) {        
        bedrijf newbedrijf = bedrijfService.getById(bedrijf_id).get();
        Land land = landService.getById(land_id);
        newbedrijf.addLand(land);
        bedrijfService.addBedrijf(newbedrijf);
    }
}
