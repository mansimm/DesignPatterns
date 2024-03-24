package PrototypePattern;

public class Test {

    public static void main(String args[]) throws CloneNotSupportedException {
        //Prototype Pattern - instead of creating multiple objects it will use existing object(prototype) to initialize all other objects
        Game game1 = new Game();
        game1.setId(1);
        game1.setName("Temple Run");
        game1.setMembership(new Membership());
        System.out.println(game1);

        Game game2 = game1.clone();
        System.out.println(game2);

        Game game3 = new Game(game1);
        System.out.println(game3);
    }
}
