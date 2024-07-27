package models;

public class Book {
  private String isbn, title, author;
  private int qty;
  private double price;

  public Book(String isbn, String title, String author, int qty, double price) {
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.qty = qty;
    this.price = price;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

}