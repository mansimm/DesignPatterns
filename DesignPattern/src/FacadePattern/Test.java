package FacadePattern;

public class Test {
    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade();
        facade.processOrder("MacBook", 1);
    }
}
