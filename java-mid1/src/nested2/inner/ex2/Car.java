package nested2.inner.ex2;

public class Car {
    private final String model;
    private final int chargeLevel;
    private final Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    private class Engine {
        private void start() {
            System.out.println("충전 레벨 확인 : " + chargeLevel);
            System.out.println(model);

        }
    }

    public void start() {
        engine.start();
        System.out.println(model + " : 시작완료");
    }
}
