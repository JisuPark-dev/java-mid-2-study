package poly.ex2;


public class AnimalSoundMain2 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal caw = new Caw();

        call(dog);
        call(cat);
        call(caw);

    }

    private static void call(Animal animal) {
        System.out.println("동물 소리 시작");
        animal.sound();
        System.out.println("동물 소리 종료");
    }
}
