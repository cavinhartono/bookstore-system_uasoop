package roles;

public class Customer extends User {
  private String ID, name;

  public Customer(String ID, String name, String username, String password) {
    super(username, password, "Customer");
    this.ID = ID;
    this.name = name;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public String getID() {
    return ID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}