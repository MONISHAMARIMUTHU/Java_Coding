package InterfaceAbs;

interface Vehicle {
    void start();  // Abstract method

    // Default method (has implementation)
    default void honk() {
        System.out.println("Vehicle is honking!");
    }
}

class Car implements Vehicle {
    @Override
    public void start() { 
        System.out.println("Car starts with a key.");
    }

    //default method overridden using public method
    @Override
    public void honk() {
        System.out.println("honk");
        Vehicle.super.honk(); // Calls the default method from the interface
    }
}

public class default_method {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Output: Car starts with a key.
        myCar.honk();  // Output: Vehicle is honking!
    }
}
