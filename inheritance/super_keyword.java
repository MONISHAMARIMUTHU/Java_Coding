//package inheritance;
class Animal {
    void sound() {
        System.out.println("Some generic animal sound...");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound(); // Calls the parent method
        System.out.println("Dog barks...");
    }
}

public class super_keyword {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
    }
}
