package defaultandStaticMethodJava8;

public interface MathOperation {
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}
