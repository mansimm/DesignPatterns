package proxyPattern;

public class Test {
    public static void main(String args[]){
        Customer customer = new CustomerImplProxy();
        System.out.println("Customer Id: "+customer.getId()+", Orders: "+customer.getOrders());
    }
}
