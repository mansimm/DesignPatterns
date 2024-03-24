package FacadePattern;

public class OrderFacade {
    OrderProcessor processor = new OrderProcessor();

    public void processOrder(String productName, int quantity){
        if(processor.checkStock(productName, quantity)){
            String orderId = processor.placeOrder();
            processor.shipOrder(orderId);
        }else{
            System.out.println(productName+" is out of stock ...");
        }
    }
}
