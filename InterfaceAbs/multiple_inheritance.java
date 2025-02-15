package InterfaceAbs;
// First interface
interface Flyable {
    void fly();
}

// Second interface
interface Swimmable {
    void swim();
}

// A class implementing multiple interfaces
class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming!");
    }
}

public class multiple_inheritance {
    public static void main(String[] args) {
        Duck myDuck = new Duck();
        myDuck.fly();  // Output: Duck is flying!
        myDuck.swim(); // Output: Duck is swimming!
    }
}


