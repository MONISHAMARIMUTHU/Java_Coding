package controlFlow;

class FinalField {
    final int x;

    FinalField() {
        x = 100; // Required initialization
        System.out.println("Final field x = " + x);
    }
}

public class constructor5 {
    public static void main(String[] args) {
        FinalField obj = new FinalField();
    }
}

//If a variable is marked final, it must be initialized either during declaration or inside every