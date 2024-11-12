package designpatterns.creational.abstractFactory;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}
