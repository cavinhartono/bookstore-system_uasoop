package models;

public class Payment {
  private String ID, orderID, method;
  private double amount;

  public Payment(String ID, String orderID, String method, double amount) {
    this.ID = ID;
    this.orderID = orderID;
    this.method = method;
    this.amount = amount;
  }

  public String getID() {
    return ID;
  }

  public void setID(String iD) {
    ID = iD;
  }

  public String getOrderID() {
    return orderID;
  }

  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }
}
