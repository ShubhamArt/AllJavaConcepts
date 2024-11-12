package designpatterns.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        // Choose the factory type
        ShapeFactory factory = new CircleFactory();  // Change to SquareFactory to create a Square

        // Create the shape and draw it
        Shape shape = factory.createShape();
        shape.draw();  // Outputs: "Drawing a Circle." or "Drawing a Square."
    }
}
