package designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        // Using the Builder Pattern to create a Car object
        Car car = new Car.CarBuilder()
                .setEngine("V8 Engine")
                .setWheels("Alloy Wheels")
                .setColor("Red")
                .build();

        // Print out the car details
        System.out.println("Car Details: ");
        System.out.println("Engine: " + car.getEngine());
        System.out.println("Wheels: " + car.getWheels());
        System.out.println("Color: " + car.getColor());
    }
}
