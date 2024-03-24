package abstractFactoryPattern;

public class DbDaoFactory extends DaoAbstractFactory {

    public Dao createDao(String type){
        Dao dao = null;
        if(type.equals("emp")){
            dao = new DbEmployeeDao();
        }else if(type.equals("dept")){
            dao = new DbDeptDao();
        }
        return dao;
    }
}
