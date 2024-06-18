package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectronicCar electronicCar = new ElectronicCar();
        electronicCar.move();
        electronicCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        WaterCar waterCar = new WaterCar();
        waterCar.move();
        waterCar.openDoor();
        waterCar.fillWater();

     }
}
