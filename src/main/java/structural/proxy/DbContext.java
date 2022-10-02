package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class DbContext {
  private Map<Integer, IProduct> updatedObjects = new HashMap<>();

  public IProduct getProduct(int id) {
    // Automatically generate SQL statements
    // to read the product with the given ID.
    System.out.printf("SELECT * FROM products WHERE product_id = %d \n", id);

    // Simulate reading a product object from a database.
    var product = new Product(id);
    product.setName("Product 1");

    ProductProxy productProxy = new ProductProxy(product, this);
    
    return productProxy;
  }

  public void saveChanges() {
    // Automatically generate SQL statements
    // to update the database.
    for (var updatedObject : updatedObjects.values())
      System.out.printf("UPDATE products SET name = '%s' WHERE product_id = %d \n", updatedObject.getName(), updatedObject.getId());

    updatedObjects.clear();
  }

  public void markAsChanged(IProduct product) {
    updatedObjects.put(product.getId(), product);
  }

}
