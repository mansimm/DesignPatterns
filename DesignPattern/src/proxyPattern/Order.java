package proxyPattern;

public class Order {
    private int id;
    private String productName;

    public Order(int id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                '}';
    }
}
