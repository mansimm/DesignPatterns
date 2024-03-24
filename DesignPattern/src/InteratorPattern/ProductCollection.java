package InteratorPattern;

public class ProductCollection implements Collection {
    private Product[] product;
    private int noOfProducts;

    public ProductCollection(){
        this.product = new Product[10];
    }

    @Override
    public void addProduct(Product product) {
        this.product[noOfProducts] = product;
        noOfProducts+=1;
    }

    @Override
    public Iterator getProductIterator() {
        return new ProductIterator(this.product);
    }
}
