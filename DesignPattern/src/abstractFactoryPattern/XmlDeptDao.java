package abstractFactoryPattern;

public class XmlDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving department to xml");
    }
}
