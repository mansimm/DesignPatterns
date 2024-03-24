package InteratorPattern;

public class Test {
    public static void main(String[] args) {
        ProductCollection products = new ProductCollection();
        products.addProduct(new Product("iphone"));
        products.addProduct(new Product("smasung"));
        products.addProduct(new Product("macbook"));

        Iterator iterator = products.getProductIterator();
        while (iterator.hasNest()){
            System.out.println(iterator.next());
        }
    }
}
