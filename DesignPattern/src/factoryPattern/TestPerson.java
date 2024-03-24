package factoryPattern;

public class TestPerson {

    public static void main(String args[]){
        Person p = PersonFactory.getPerson("Female");
        p.wish("Good morning");

        Person p2 = PersonFactory.getPerson("Male");
        p2.wish("Good morning");
    }
}
