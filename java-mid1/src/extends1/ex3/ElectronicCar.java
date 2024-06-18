package extends1.ex3;

public class ElectronicCar extends Car {

    @Override
    public void move() {
        System.out.println("좀 더 빠르게 이동합니다. ");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}