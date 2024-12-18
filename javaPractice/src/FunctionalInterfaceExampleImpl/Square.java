package FunctionalInterfaceExampleImpl;

public class Square implements Calculator {

    @Override
    public int calculate(int a, int b) {
        // For square, we only use one operand (a), so we ignore b.
        return a * a;
    }
}
