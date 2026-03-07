class Engine{
    void startEngine() {
        System.out.println("Engine started");
    }
}
class Car{
    Engine engine = new Engine();
    void startCar() {
        engine.startEngine();
        System.out.println("Car is running");
    }
}
public class CarEngineExample{
    public static void main(String[] args) {
        Car c = new Car();
        c.startCar();
    }
}