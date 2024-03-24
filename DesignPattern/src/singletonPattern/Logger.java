package singletonPattern;

import java.io.Serializable;

public class Logger implements Serializable, Cloneable {
    public volatile static Logger logger;
    private Logger(){

    }
    public static Logger getLogger(){
        if(logger==null){
            synchronized (Logger.class){
                logger = new Logger();
            }
        }
        return logger;
    }

    public void readRessolve(){

    }
    public static void log(String message){
        System.out.println(message);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
