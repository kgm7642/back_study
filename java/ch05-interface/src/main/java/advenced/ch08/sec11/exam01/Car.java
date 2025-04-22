package advenced.ch08.sec11.exam01;

public class Car {
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    public void run() {
        this.tire1.roll();
        this.tire2.roll();
    }
}
