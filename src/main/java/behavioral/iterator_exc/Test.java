package behavioral.iterator_exc;

public class Test {

    public static void main(String[] args) {

        System.out.println("START TESTS...");

        ProductCollection productCollection = new ProductCollection();
        productCollection.add(new Product(1, "ksiazka"));
        productCollection.add(new Product(2, "lampa"));
        productCollection.add(new Product(3, "biurko"));
        productCollection.add(new Product(4, "podeszwa"));
        productCollection.add(new Product(5, "kijek"));


        MyIterator<Product> defaultIterator = productCollection.createDefaultIterator();

        while(defaultIterator.hasNext()) {
            defaultIterator.next();
            System.out.println(defaultIterator.getCurrent());
        }

        System.out.println("KONIEC.");

    }
}
