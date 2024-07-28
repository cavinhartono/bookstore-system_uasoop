package roles;

import models.Book;
import models.Bookstore;

public interface Action {
  void showMenu();

  void addBook(Bookstore bookstore, Book book);

  void viewOrders(Bookstore bookstore);

  void registerCustomer(Bookstore bookstore, Customer customer);
}
