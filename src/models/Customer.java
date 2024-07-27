package models;

public class Customer {
  private String ID, name;

  public Customer(String ID, String name) {
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