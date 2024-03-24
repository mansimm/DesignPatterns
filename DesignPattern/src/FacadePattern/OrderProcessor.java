package FacadePattern;

public class OrderProcessor {

    public boolean checkStock(String productName, int quantity){
        return true;
    }
    public String placeOrder(){
        return "order123";
    }

    public void shipOrder(String orderId){
        System.out.println("Shipping order id : "+ orderId);
    }
}
