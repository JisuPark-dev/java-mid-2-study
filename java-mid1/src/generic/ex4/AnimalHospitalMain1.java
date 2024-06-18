package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMain1 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 50);
        Dog dog2 = new Dog("멍멍이2", 200);

        dogHospital.set(dog);
        catHospital.set(cat);

        dogHospital.checkup();
        catHospital.checkup();

        System.out.println(dogHospital.bigger(dog2));

    }
}
