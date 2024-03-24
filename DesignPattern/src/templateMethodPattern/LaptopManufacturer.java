package templateMethodPattern;

public class LaptopManufacturer extends ComputerManufacturer{
    @Override
    public void addHardDisk() {
        System.out.println("Adding Hard disk to laptop");
    }

    @Override
    public void addRam() {
        System.out.println("Adding RAM to laptop");
    }

    @Override
    public void addKeyboard() {
        System.out.println("Adding key board to laptop");
    }
}
