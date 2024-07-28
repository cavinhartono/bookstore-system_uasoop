package roles;

public abstract class User {
  private String username, password, role;

  public User(String username, String password, String role) {
    this.username = username;
    this.password = password;
    this.role = role;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getRole() {
    return role;
  }

  public boolean isAuthenticate(String username, String password) {
    return this.username.equals(username) && this.password.equals(password);
  }
}
