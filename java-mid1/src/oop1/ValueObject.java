package oop1;

public class ValueObject {
    int value;

    void add() {
        this.value++;
        System.out.println("value is now " + this.value);
    }
}
