package generic.ex6;

import generic.animal.Animal;

public class WildcardEx {
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGeneric2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        System.out.println("사이즈 = " + t.getSize());
    }

    static void printWildcard2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        System.out.println("사이즈 = " + animal.getSize());
    }

    static <T extends Animal> T printGeneric3(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        System.out.println("사이즈 = " + t.getSize());
        return t;
    }

    static Animal printWildcard3(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        System.out.println("사이즈 = " + animal.getSize());
        return animal;
    }
}
