public class Runner {
    public static void main(String[] args) {
        Animal animals = new Animal("Some Animal", 7, true, false);
        System.out.println(animals.getName());
        System.out.println(animals.getAge());
        animals.adopt();
        animals.feed();
        animals.poop();

        Dog Truffles = new Dog("Truffles", 7, true, false, true, false);
        System.out.println(Truffles.getName());
        System.out.println(Truffles.getAge());
        Truffles.hasBeenWalked();
        Truffles.hasBeenGroomed();
        Truffles.bark();
        Truffles.walk();

        Cat Ruffles = new Cat("Ruffles", 3, false, false, true, true);
        System.out.println(Ruffles.getName());
        System.out.println(Ruffles.getAge());
        Ruffles.hasBeenWalked();
        Ruffles.hasBeenGroomed();
        Ruffles.meow();
    }
}
