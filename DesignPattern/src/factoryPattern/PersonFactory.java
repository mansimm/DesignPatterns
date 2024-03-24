package factoryPattern;

public class PersonFactory {
    public static Person getPerson(String gender){
        Person p = null;
        if(gender.equals("Female")){
            p = new Female();
        }else if(gender.equals("Male")){
            p = new Male();
        }
        return p;
    }
}
