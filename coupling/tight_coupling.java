package coupling;
class Engine1{
    void start(){
        System.out.println("Engine started");
    }
}
class car1{
    private final Engine1 engine = new Engine1();// Direct dependency (tight coupling)
    void startCar(){
        engine.start();
        System.out.println("Car started");
    }
}
public class tight_coupling {
    public static void main(String[] args) {
        car1 mycar=new car1();
        mycar.startCar();
    }
}

// Engine started
// Car started
