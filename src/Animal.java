public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private boolean collar;

    public Animal(String name, int age, boolean vaccinated, boolean collar){
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.collar = collar;
    }

    public String getName()
    { return name; }
    public int getAge()
    { return age; }
    public boolean isVaccinated()
    { return vaccinated; }
    public boolean hasCollar()
    { return collar; }

    public void adopt(){
        System.out.println("I have been adopted");
    }
    public void feed(){
        System.out.println("I have been fed, thank you");
    }
    public void poop(){
        System.out.println("I gotta go potty");
    }
}
