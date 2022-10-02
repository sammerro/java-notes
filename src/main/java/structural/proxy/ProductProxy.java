package structural.proxy;

public class ProductProxy implements IProduct {

    private Product product;
    DbContext dbContext;

    public ProductProxy(Product product, DbContext dbContext) {
        this.product = product;
        this.dbContext = dbContext;
    }

    @Override
    public int getId() {
        return product.getId();
    }

    @Override
    public String getName() {
        return product.getName();
    }

    @Override
    public void setName(String name) {
        product.setName(name);
        dbContext.markAsChanged(product);
    }
}
