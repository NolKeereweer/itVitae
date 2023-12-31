package api.v1.security.model;

import jakarta.persistence.*;

@Entity
@Table(name = "`user`")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String username;
  private String password;
  private String roles;

  public User() {}
  public User(String username, String password, String roles) {
    this.username = username;
    this.password = password;
    this.roles = roles;
  }

  public String getRoles() {
    return roles;
  }

  public void setRoles(String roles) {
    this.roles = roles;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
