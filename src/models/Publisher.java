package models;

public class Publisher {
  private String ID, name, address;

  public Publisher(String ID, String name, String address) {
    this.ID = ID;
    this.name = name;
    this.address = address;
  }

  public String getId() {
    return ID;
  }

  public void setId(String ID) {
    this.ID = ID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

}
