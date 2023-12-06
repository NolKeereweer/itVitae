package api.v1.security.configuration;

import api.v1.security.model.User;
import api.v1.security.repository.UserRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class Setup {

  @Autowired
  PasswordEncoder passwordEncoder;

  @Autowired
  UserRepository userRepository;

  @EventListener
  @Transactional
  public void onApplicationEvent(ApplicationReadyEvent event) {
    User user = new User("Admin", passwordEncoder.encode("admin"), "ROLE_USER");
    userRepository.save(user);
  }
}
