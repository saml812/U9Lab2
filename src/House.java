public class House extends Buildings{
    private boolean hasFamily;

    public House(String name, String material, double height, double length, double width, boolean isOpen, boolean hasFamily){
        super(name, material, height, length, width, isOpen);
        this.hasFamily = hasFamily;
    }

    public boolean isHasFamily() {
        return hasFamily;
    }
    public void Awake(){
        System.out.println("Lights on, they are awake");
    }
}
