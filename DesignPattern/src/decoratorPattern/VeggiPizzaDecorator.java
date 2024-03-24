package decoratorPattern;

public class VeggiPizzaDecorator extends PizzaDecorator{

    public VeggiPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake(){
        super.bake();
        System.out.println("Adding veggie toppings");
    }
}
