package designpatterns.creational.factory;

import designpatterns.creational.factory.ShapeFactory;
import designpatterns.creational.factory.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();

    }
}
