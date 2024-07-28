package models;

import java.util.List;
import java.util.ArrayList;

import roles.Customer;

public class Cart {
  private String ID;
  private Customer customer;
  private List<Book> Books;
  private double totalAmount;

  public Cart(String ID, Customer customer) {
    this.ID = ID;
    this.customer = customer;
    this.Books = new ArrayList<>();
    this.totalAmount = 0;
  }

  public String getID() {
    return ID;
  }

  public void setID(String iD) {
    ID = iD;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public List<Book> getBooks() {
    return Books;
  }

  public void addBook(Book book) {
    Books.add(book);
    totalAmount += book.getPrice();
  }

  public void removeBook(Book book) {
    Books.remove(book);
    totalAmount -= book.getPrice();
  }

  public double getTotalAmount() {
    return totalAmount;
  }

  @Override
  public String toString() {
    return "ShoppingCart [CartID=" + ID + ", Customer=" + customer + ", Books=" + Books + ", Total Amount="
        + totalAmount + "]";
  }
}
