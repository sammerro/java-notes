package behavioral.iterator_exc;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {

    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public MyIterator<Product> createDefaultIterator() {
        return new MyIterator<Product>() {
            private int idx = -1;
            @Override
            public boolean hasNext() {
                return idx < products.size() - 1;
            }

            @Override
            public Product getCurrent() {
                return products.get(idx);
            }

            @Override
            public void next() {
                idx++;
            }
        };
    }

}
