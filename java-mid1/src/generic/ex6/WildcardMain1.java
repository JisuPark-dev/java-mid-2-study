package generic.ex6;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));
        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);
        WildcardEx.printGeneric2(dogBox);
        WildcardEx.printWildcard2(dogBox);
        Dog dog = WildcardEx.printGeneric3(dogBox);
        Animal animal = WildcardEx.printWildcard3(dogBox);


    }
}
