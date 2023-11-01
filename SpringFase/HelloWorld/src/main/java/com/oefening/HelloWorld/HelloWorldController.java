package com.oefening.HelloWorld;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("{id}")
  public String getById(@PathVariable long id) {
    List<String> myCars = List.of("Z4", "ForeRunner", "Sequoia");

    return myCars.get((int) id);
  }

  @GetMapping("/")
  public String eersteEndpoint(){
    return "Dit is je eerste endpoint";
  }

  @GetMapping("/nextPage")
  public String nextEndpoint(){
    return "Welkom op de Spring Boot back-end";
  }

  @GetMapping("/integer")
  public int numEndpoint(){
    return 2002;
  }

  @GetMapping("/cars")  
  public ArrayList cars(){
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("BMW Z4");
    cars.add("Toyota ForeRunner");
    cars.add("Toyota Sequoia");

    return cars;
  }
}