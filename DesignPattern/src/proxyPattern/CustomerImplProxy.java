package proxyPattern;

import java.util.ArrayList;
import java.util.List;

public class CustomerImplProxy implements Customer{
    CustomerImpl customer = new CustomerImpl();

    @Override
    public int getId() {
        return customer.getId();
    }

    @Override
    public List<Order> getOrders() {
        Order o1 = new Order(1,"T-shirt");
        Order o2 = new Order(1,"Jacket");
        Order o3 = new Order(1,"Shoes");
        List<Order> orders = new ArrayList<>();
        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
        return orders;
    }
}
