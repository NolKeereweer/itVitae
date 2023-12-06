// package data.v1.databaseexcersise;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;
//
// @Component
// public class Seeder implements CommandLineRunner {
//
//   @Autowired
//   BedrijfService bedrijfService;
//
//   @Autowired
//   BedrijfRepository bedrijfRepository;
//
//   public void run(String... args) throws Exception {
//     if (bedrijfRepository.count() == 0) {
//       bedrijfService.addBedrijf(new bedrijf("New bedrijf1", 99));
//       bedrijfService.addBedrijf(new bedrijf("New bedrijf2", 88));
//       bedrijfService.addBedrijf(new bedrijf("New bedrijf3", 77));
//     }
//   }
// }
