package roles;

public interface Action {
  void addProduct(String name, String productID, double price, int qty);

  void upgradeProductInQty(String productID, int amount);

  void sellProduct(String productID, int qty);
}
