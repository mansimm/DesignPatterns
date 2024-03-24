package decoratorPattern;

public class PizzaShop {

    public static void main(String args[]){
        Pizza pizza = new PlainPizza();
        pizza.bake();

        //Decorator design pattern adds extra functionality to object dynamically
        //eg. BufferedReader out = new BufferedReader(new FileReader())
        System.out.println();
        pizza = new VeggiPizzaDecorator(new PlainPizza());
        pizza.bake();

        System.out.println();
        pizza = new CheesePizzaDecorator(new PlainPizza());
        pizza.bake();
    }
}
