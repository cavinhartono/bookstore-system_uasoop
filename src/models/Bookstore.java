package models;

import java.util.List;
import java.util.ArrayList;

public class Bookstore {
  private List<Book> Inventory;
  private List<Customer> Customers;
  private List<Order> Orders;

  public Bookstore() {
    this.Inventory = new ArrayList<>();
    this.Customers = new ArrayList<>();
    this.Orders = new ArrayList<>();
  }

  public List<Book> getInventory() {
    return Inventory;
  }

  public void addBook(Book book) {
    Inventory.add(book);
  }

  public List<Order> getOrders() {
    return Orders;
  }

  public void placeOrder(Order order) {
    Orders.add(order);
  }

  public List<Customer> getCustomers() {
    return Customers;
  }

  public void addCustomer(Customer customer) {
    Customers.add(customer);
  }
}
