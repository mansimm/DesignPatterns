package InteratorPattern;

public class ProductIterator implements Iterator{
    private Product[] product;
    private int pos = 0;

    public ProductIterator(Product[] product){
        this.product = product;
    }
    @Override
    public boolean hasNest() {
        if(pos>=product.length || product[pos]==null)
            return false;
        else
            return true;
    }

    @Override
    public Product next() {
        return product[pos++];
    }
}
