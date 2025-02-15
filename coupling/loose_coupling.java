package coupling;

interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol Engine started");
    }
}

class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric Engine started");
    }
}

class Car {
    private final Engine engine;

    // Injecting dependency through constructor (Dependency Injection)
    Car(Engine engine) {
        this.engine = engine;
    }

    void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}

public class loose_coupling {
    public static void main(String[] args) {
        Engine engine = new PetrolEngine(); // Decoupling with abstraction
        Car car = new Car(engine);  // Injecting dependency
        car.startCar();
        Engine electricEngine = new ElectricEngine();
        Car electricCar = new Car(electricEngine);
        electricCar.startCar();

    }
}
//Instead of directly creating an instance of Engine, 
//the Car class receives an Engine object through the constructor.


//Key Benefits of Loose Coupling
//✅ Flexibility: We can easily switch to another engine type (e.g., ElectricEngine) without modifying Car.
//✅ Better Maintainability: Changes in Engine do not require changes in Car.