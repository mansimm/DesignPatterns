package abstractFactoryPattern;

public class XmlEmployeeDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving employee to xml");
    }
}
