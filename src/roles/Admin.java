package roles;

import models.Book;
import models.Bookstore;
import models.Order;

public class Admin extends User implements Action {
  public Admin(String username, String password) {
    super(username, password, "Admin");
  }

  @Override
  public void addBook(Bookstore bookstore, Book book) {
    bookstore.addBook(book);
  }

  @Override
  public void viewOrders(Bookstore bookstore) {
    for (Order order : bookstore.getOrders()) {
      System.out.println(order);
    }
  }

  @Override
  public void registerCustomer(Bookstore bookstore, Customer customer) {
    bookstore.addCustomer(customer);
  }

  @Override
  public void showMenu() {
    String[] Menus = { "Tambah Buku", "Riwayat Order", "Customer", "Cari Buku", "Keluar" };
    int number = 1;

    for (String menu : Menus) {
      System.out.println("Tekan " + number + " untuk " + menu);
    }
  }
}
