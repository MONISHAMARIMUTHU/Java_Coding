abstract class Computer {
    final void osInfo() {  // Final method (cannot be overridden)
        System.out.println("Operating System: Windows or macOS.");
    }
}

class Laptop extends Computer {
    // Cannot override osInfo() because it's final
}

public class abs_final {
    public static void main(String[] args) {
        Computer myLaptop = new Laptop();
        myLaptop.osInfo();  // Output: Operating System: Windows or macOS.
    }
}
