package designpatterns.creational.builder;

public class Car {
    private String engine;
    private String wheels;
    private String color;

    public String getEngine() {return engine;}
    public String getWheels() {return wheels;}
    public String getColor() {return color;}

    public static class CarBuilder {
        private String engine;
        private String wheels;
        private String color;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(String wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.engine = this.engine;
            car.wheels = this.wheels;
            car.color = this.color;
            return car;
        }
    }
}
