package designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        // Access the Singleton instance
        Animal animal = Animal.getInstance();
        System.out.println(animal);

        // Access the Singleton instance again and check properties
        Animal anotherAnimal = Animal.getInstance();
        System.out.println(anotherAnimal);

        // Verify both references point to the same instance
        System.out.println("Both references are the same: " + (animal == anotherAnimal));
    }
}
