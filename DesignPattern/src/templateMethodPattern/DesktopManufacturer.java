package templateMethodPattern;

public class DesktopManufacturer extends ComputerManufacturer{
    @Override
    public void addHardDisk() {
        System.out.println("Adding Hard disk to desktop");
    }

    @Override
    public void addRam() {
        System.out.println("Adding RAM to desktop");
    }

    @Override
    public void addKeyboard() {
        System.out.println("Adding key board to desktop");
    }
}
