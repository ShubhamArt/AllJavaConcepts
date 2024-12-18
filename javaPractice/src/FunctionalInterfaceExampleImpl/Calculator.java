package FunctionalInterfaceExampleImpl;

@FunctionalInterface
public interface Calculator {
    // Abstract method to perform a calculation
    int calculate(int a, int b);

    // Default method (optional)
    default void printResult(int a, int b) {
        System.out.println("The result of the operation is: " + calculate(a, b));
    }

    // Static method (optional)
    static void description() {
        System.out.println("Calculator interface for mathematical operations.");
    }
}
