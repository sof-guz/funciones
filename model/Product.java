package model;
public class Product{
  private String name;
  private double price;
  private int stock;

  public Product(String name, double price, int stock){
    this.name = name;
    this.price = price;
    this.stock = stock;
  }

  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public double getPrice(){
    return price;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public int getStock(){
    return stock;
  }
  public void setStock(int stock){
    this.stock = stock;
  }

  @Override
  public String toString() {
        return "Product [name:" + name + ", price:" + price + ", stock:" + stock + "]";
  }
  public boolean isOutOfStock() {
        return stock <= 0;
    }

    public boolean isPriceGreaterThan(double value) {
        return price > value;
    }

    public boolean isPriceLessThanOrEqualTo(double value) {
        return price <= value;
    }

    public boolean containsKeyword(String keyword) {
        return name.toLowerCase().contains(keyword.toLowerCase());
    }
}