abstract class Vehicle {
    abstract void start();
    void fuelType() {
        System.out.println("Uses petrol");
    }
}
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike started");
    }
}
public class PartialAbstractionDemo {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.fuelType();
    }
}