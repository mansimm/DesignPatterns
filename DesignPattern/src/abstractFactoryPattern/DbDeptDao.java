package abstractFactoryPattern;

public class DbDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving department to database");
    }
}
