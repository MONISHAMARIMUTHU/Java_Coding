package inheritance;
// Parent class (Superclass)
class vehicle{
    void start(){
        System.out.println("Vechicle started");
    }
}
// Child class (Subclass) that inherits from Vehicle
class car extends vehicle{
    void honk(){
        System.out.println("Car is honking");
    }
}
public class single_inheritance {
    public static void main(String[] args) {
        car mycar=new car();
        mycar.start();// Inherited from Vehicle
        mycar.honk();  // Defined in Car
    }
}
//Single Inheritance (One Parent → One Child)
//A subclass inherits from a single superclass.