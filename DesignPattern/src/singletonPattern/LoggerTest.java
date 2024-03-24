package singletonPattern;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();

        if(logger1 == logger2){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }
    }
}
