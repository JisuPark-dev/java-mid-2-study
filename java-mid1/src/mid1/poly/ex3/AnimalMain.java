package mid1.poly.ex3;


public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal caw = new Caw();

        animalSound(dog);
        animalSound(cat);
        animalSound(caw);
    }

    private static void animalSound(Animal animal) {
        System.out.println("=======");
        animal.sound();
        System.out.println("=======");
    }
}
