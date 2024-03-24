package factoryPattern;

import java.sql.SQLOutput;

public class Female implements Person{

    @Override
    public void wish(String message) {
        System.out.println(message+" Madam");
    }
}
