package Composition;
class Engine {
    void start() {
        System.out.println("Engine started.");
    }
}

class Car {
    private final Engine engine; // Composition

    Car() {
        engine = new Engine(); // Strong ownership
    }

    void start() {
        System.out.println("Car is starting...");
        engine.start();
    }
}

public class engine_eg {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        // The Engine will be destroyed if the Car is destroyed.
    }
}

