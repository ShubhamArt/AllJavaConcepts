package defaultandStaticMethodJava8;

public class Main {
    public static void main(String[] args) {
        // Testing Animal interface with Cat and Dog
        Animal cat = new Cat();
        cat.sound();  // Output: Meow

        Animal dog = new Dog();
        dog.sound();  // Output: Bark

        // Using static method from Animal interface
        Animal.info();  // Output: Animals are living beings.

        // Testing MathOperation interface
        MathOperation mathOp = new MathOperation() {}; // Anonymous class to use default method
        System.out.println("Addition: " + mathOp.add(10, 5));  // Output: Addition: 15

        System.out.println("Multiplication: " + MathOperation.multiply(10, 5));  // Output: Multiplication: 50
    }
}
