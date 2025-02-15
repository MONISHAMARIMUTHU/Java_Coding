abstract class vehicle{
    String brand;
    // Constructor
    vehicle(String brand){
        this();
        this.brand=brand;
        System.out.println(brand + " is created");
        
    }

    vehicle(){
        System.out.println("constructor->this");
    }
    abstract void start(); //Abstract Class with Multiple Abstract Methods
    abstract void brake(); 
}

class car extends vehicle{
    car(String brand){
        super(brand);// Calling abstract class constructor
    }
    @Override
    void start(){
        System.out.println(brand + " started");
    }
    @Override
    void brake(){
        System.out.println("Brake applied in "+ brand);
    }
}

public class abs_constructor{
    public static void main(String[] args) {
        vehicle myCar = new car("Ferrari");
        myCar.start();
        myCar.brake();
    }
}