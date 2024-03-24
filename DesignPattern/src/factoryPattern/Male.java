package factoryPattern;

public class Male implements Person{

    @Override
    public void wish(String message) {
        System.out.println(message+" Sir");
    }
}
