package InterfaceAbs;
interface Logger {
    default void logInfo(String message) {
        log("INFO: " + message);
    }

    default void logError(String message) {
        log("ERROR: " + message);
    }

    // Private method inside the interface
    private void log(String message) {
        System.out.println(message);
    }
}

class Application implements Logger {} //Needed because subclass only inherits parent's method
//since object cannot be created for interface

public class private_method {
    public static void main(String[] args) {
        Application app = new Application();
        app.logInfo("Application started.");  // Output: INFO: Application started.
        app.logError("Something went wrong!");  // Output: ERROR: Something went wrong!
    }
}
