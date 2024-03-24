package abstractFactoryPattern;

public class XmlDaoFactory extends DaoAbstractFactory {

    public Dao createDao(String type){
        Dao dao = null;
        if(type.equals("emp")){
            dao = new XmlEmployeeDao();
        }else if(type.equals("dept")){
            dao = new XmlDeptDao();
        }
        return dao;
    }
}
