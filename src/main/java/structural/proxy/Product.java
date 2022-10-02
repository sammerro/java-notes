package structural.proxy;

public class Product implements IProduct {
  private int id;
  private String name;

  public Product(int id) {
    this.id = id;
  }

  @Override
  public int getId() {
    return id;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }
}
