package controlFlow;

class Car {
    String brand;
    int year;

    Car() {
        this("Unknown", 0); // constructor chaining
    }

    Car(String brand) {
        this(brand, 2020);
    }

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}


public class constructor3 {
    public static void main(String[] args) {
        Car car1 = new Car(); // uses no-arg constructor
        Car car2 = new Car("Toyota"); // uses one-arg constructor
        Car car3 = new Car("Honda", 2022); // uses two-arg constructor

        System.out.println("Car 1 -> Brand: " + car1.brand + ", Year: " + car1.year);
        System.out.println("Car 2 -> Brand: " + car2.brand + ", Year: " + car2.year);
        System.out.println("Car 3 -> Brand: " + car3.brand + ", Year: " + car3.year);
    }
}


