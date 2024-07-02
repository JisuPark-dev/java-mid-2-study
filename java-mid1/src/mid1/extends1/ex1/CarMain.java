package mid1.extends1.ex1;

import mid1.extends1.ex2.ElectronicCar;
import mid1.extends1.ex2.GasCar;

public class CarMain {
    public static void main(String[] args) {
        ElectronicCar electronicCar = new ElectronicCar();
        electronicCar.move();
        electronicCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

     }
}
