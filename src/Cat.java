public class Cat extends Animal{

    private boolean playedWith;
    private boolean selfGroomed;

    public Cat(String name, int age, boolean vaccinated, boolean playedWith, boolean collar, boolean beenGroomed){
        super(name, age, vaccinated, collar);
        this.playedWith = playedWith;
        this.selfGroomed = beenGroomed;
    }

    public void meow(){
        System.out.println("meow meow");
    }
    public void hasPlayedWith (){
        System.out.println("Time to go play with me");
        playedWith = true;
    }
    public boolean hasBeenWalked(){
        return playedWith;
    }
    public boolean hasBeenGroomed(){
        return selfGroomed;
    }
}
