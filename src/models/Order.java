package models;

import java.util.List;
import java.util.ArrayList;

public class Order {
  private String ID;
  private Customer customer;
  private List<Book> Books;
  private double totalAmount;

  public Order(String ID, Customer customer) {
    this.ID = ID;
    this.customer = customer;
    this.Books = new ArrayList<>();
    this.totalAmount = 0;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public String getID() {
    return ID;
  }

  public double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public List<Book> getBooks() {
    return Books;
  }

  public void addBook(Book book) {
    Books.add(book);
    totalAmount += book.getPrice();
  }
}