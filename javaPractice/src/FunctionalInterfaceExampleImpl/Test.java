package FunctionalInterfaceExampleImpl;

public class Test {
    public static void main(String[] args) {
        // Using lambda expression to implement the Calculator interface
        Calculator addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.calculate(5, 3));  // Output: 8

        // Using the Square class to calculate the square of a number
        Calculator square = new Square();
        square.printResult(4, 0);  // Output: The result of the operation is: 16

        // Using static method from the Calculator interface
        Calculator.description();  // Output: Calculator interface for mathematical operations.

        // Using lambda expression for multiplication
        Calculator multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.calculate(4, 5));  // Output: 20
    }
}
