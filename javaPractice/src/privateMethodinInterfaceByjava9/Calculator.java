package privateMethodinInterfaceByjava9;

public interface Calculator {

    // Public default method
    default int add(int a, int b) {
        return performOperation(a, b, "add");
    }

    // Public default method
    default int subtract(int a, int b) {
        return performOperation(a, b, "subtract");
    }

    // Static method
    static void displayOperations() {
        System.out.println("Available operations: add, subtract");
        log("Static method called to display operations");
    }

    // Private method for code reusability
    private int performOperation(int a, int b, String operation) {
        log("Performing " + operation + " operation");
        return switch (operation) {
            case "add" -> a + b;
            case "subtract" -> a - b;
            default -> throw new IllegalArgumentException("Invalid operation: " + operation);
        };
    }

    // Private static method for logging
    private static void log(String message) {
        System.out.println("LOG: " + message);
    }
}
