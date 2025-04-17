package basic.ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car("소나타");
        car1.speed = 200;
        car1.run();

        Car car2 = new Car("벤츠");
        car2.speed = 250;
        car2.run();
    }
}
