package api.v1.security;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ResourceController {
  @GetMapping("/")
  public String root() {
    return "This is the root";
  }

  @GetMapping("/user")
  public String user() {
    return "This is the user page";
  }

  @GetMapping("/admin")
  public String admin() {
    return "This is the admin page";
  }
}