package templateMethodPattern;

public class Test {

    public static void main(String args[]){
        LaptopManufacturer laptop = new LaptopManufacturer();
        laptop.buildComputer();

        DesktopManufacturer desktop = new DesktopManufacturer();
        desktop.buildComputer();
    }
}
