package generic.ex4;

import generic.animal.Animal;

public class AnimalHospitalV2 <T extends Animal>{
    private T animal;
    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        animal.getName();
        animal.getSize();
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
