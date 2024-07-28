package models;

public class Category {
  private String ID, name;

  public Category(String ID, String name) {
    ID = ID;
    this.name = name;
  }

  public String getID() {
    return ID;
  }

  public void setID(String iD) {
    ID = iD;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
