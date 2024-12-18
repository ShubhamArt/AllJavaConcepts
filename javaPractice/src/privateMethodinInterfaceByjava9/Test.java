package privateMethodinInterfaceByjava9;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            // Using the default implementation from the interface
        };

        int sum = calculator.add(10, 5);
        int difference = calculator.subtract(10, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        // Call static method directly from the interface
        Calculator.displayOperations();
    }
}
