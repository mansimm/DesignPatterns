package abstractFactoryPattern;

public class Test {

    public static void main(String argc[]){
        DaoAbstractFactory factory = DaoFactoryProducer.produce("db");
        Dao dao = factory.createDao("emp");
        dao.save();

        DaoAbstractFactory factory2 = DaoFactoryProducer.produce("xml");
        Dao dao2 = factory2.createDao("dept");
        dao2.save();
    }
}
