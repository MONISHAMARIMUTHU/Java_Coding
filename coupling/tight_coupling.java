package coupling;

class Engine{
    void start(){
        System.out.println("Engine started");
    }
}
class car{
    private final Engine engine = new Engine();// Direct dependency (tight coupling)
    void startCar(){
        engine.start();
        System.out.println("Car started");
    }
}
public class tight_coupling {
    public static void main(String[] args) {
        car mycar=new car();
        mycar.startCar();
    }
}
