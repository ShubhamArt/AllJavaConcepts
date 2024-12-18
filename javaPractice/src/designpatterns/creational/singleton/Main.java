package designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        // Access the Singleton instance
        Animal animal = Animal.getInstance();
        System.out.println(animal.hashCode());

        // Access the Singleton instance again and check properties
        Animal anotherAnimal = Animal.getInstance();
        System.out.println(anotherAnimal.hashCode());

    }
}
