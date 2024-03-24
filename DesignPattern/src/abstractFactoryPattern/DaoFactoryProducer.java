package abstractFactoryPattern;

public class DaoFactoryProducer {

    public static DaoAbstractFactory produce(String type){
        DaoAbstractFactory dao = null;
        if(type.equals("xml")){
            dao = new XmlDaoFactory();
        }else if(type.equals("db")){
            dao = new DbDaoFactory();
        }
        return dao;
    }
}
