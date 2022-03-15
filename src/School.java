public class School extends Buildings{
    private boolean hasStudents;

    public School(String name, String material, double height, double length, double width, boolean isOpen, boolean hasStudents){
        super(name, material, height, length, width, isOpen);
        this.hasStudents = hasStudents;
    }

    public boolean isHasStudents() {
        return hasStudents;
    }
    public void inSession(){
        System.out.println("Ring ring, School is in session!");
    }
}
