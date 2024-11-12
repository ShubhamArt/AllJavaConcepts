package designpatterns.creational.factory;

import designpatterns.creational.factory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
