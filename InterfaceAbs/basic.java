package InterfaceAbs;

//package InterfaceAbs;
// Defining an interface
interface Animal {
    void makeSound();  // Abstract method (no body)
}

// Implementing the interface in a class
class Dog implements Animal {
    @Override
    public void makeSound() {  // Must provide implementation
        System.out.println("Dog barks!");
    }
    public void sound(){
        System.out.println("sound");
    }
}

public class basic {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Allowed (Interface reference)
        myDog.makeSound(); // Output: Dog barks!
        //myDog.sound(); -> not possible
        Dog dog = new Dog();
        dog.sound();
    }
}

