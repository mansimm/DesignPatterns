package abstractFactoryPattern;

public class DbEmployeeDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving employee to database");
    }
}
