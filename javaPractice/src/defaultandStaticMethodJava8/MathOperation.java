package defaultandStaticMethodJava8;

public interface MathOperation {
    // Default method
    default int add(int a, int b) {
        return a + b;
    }

    // Static method
    static int multiply(int a, int b) {
        return a * b;
    }
}
