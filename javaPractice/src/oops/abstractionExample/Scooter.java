package oops.abstractionExample;

public  class Scooter extends Vehicle {
    @Override
    void start() {
        System.out.println("Scooter starts wih kick");
    }

    public static void main(String[] args) {
        Scooter s =new Scooter();
        s.start();
        Car c=new Car();
        c.start();
    }
}
