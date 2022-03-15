public class Dog extends Animal{

    private boolean beenWalked;
    private boolean beenGroomed;

    public Dog(String name, int age, boolean vaccinated, boolean beenWalked, boolean collar, boolean beenGroomed){
        super(name, age, vaccinated, collar);
        this.beenWalked = beenWalked;
        this.beenGroomed = beenGroomed;
    }

    public void bark(){
        System.out.println("ruff ruff");
    }
    public void walk(){
        System.out.println("Time to go outside with me");
        beenWalked = true;
    }
    public boolean hasBeenWalked(){
        return beenWalked;
    }
    public boolean hasBeenGroomed(){
        return beenGroomed;
    }
}
