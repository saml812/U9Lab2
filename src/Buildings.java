public class Buildings {
    private String name;
    private String material;
    private double height;
    private double length;
    private double width;
    private boolean isOpen;

    public Buildings(String name, String material, double height, double length, double width, boolean isOpen){
        this.name = name;
        this.material = material;
        this.height = height;
        this.length = length;
        this.width = width;
        this.isOpen = isOpen;
    }

    public String getName() {
        return name;
    }
    public String getMaterial() {
        return material;
    }
    public double getHeight() {
        return height;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public boolean isOpen() {
        return isOpen;
    }

    public void greet(){
        System.out.println("Welcome peoples");
    }
}
