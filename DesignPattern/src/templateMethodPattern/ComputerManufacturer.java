package templateMethodPattern;

public abstract class ComputerManufacturer {
    public void buildComputer(){
        addHardDisk();
        addRam();
        addKeyboard();
    }
    public abstract void addHardDisk();
    public abstract void addRam();
    public abstract void addKeyboard();

}
