package models;

public class Review {
  private String ID, bookIsbn, customerID, reviewText;
  private double rating;

  public Review(String iD, String bookIsbn, String customerID, String reviewText, double rating) {
    ID = iD;
    this.bookIsbn = bookIsbn;
    this.customerID = customerID;
    this.reviewText = reviewText;
    this.rating = rating;
  }

  public String getID() {
    return ID;
  }

  public void setID(String iD) {
    ID = iD;
  }

  public String getBookIsbn() {
    return bookIsbn;
  }

  public void setBookIsbn(String bookIsbn) {
    this.bookIsbn = bookIsbn;
  }

  public String getCustomerID() {
    return customerID;
  }

  public void setCustomerID(String customerID) {
    this.customerID = customerID;
  }

  public String getReviewText() {
    return reviewText;
  }

  public void setReviewText(String reviewText) {
    this.reviewText = reviewText;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  @Override
  public String toString() {
    return "Review [ReviewID=" + ID + ", BookISBN=" + bookIsbn + ", CustomerID=" + customerID + ", ReviewText="
        + reviewText + ", Rating=" + rating + "]";
  }
}
