package designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        // Access the Singleton instance
        Animal animal = Animal.getInstance();
        animal.makeSound(); // Default sound

        // Change the species and name of the Animal
        animal.setSpecies("Tiger");
        animal.setName("Rajah");

        // Access the Singleton instance again and check properties
        Animal anotherAnimal = Animal.getInstance();
        anotherAnimal.makeSound();

        // Verify both references point to the same instance
        System.out.println("Both references are the same: " + (animal == anotherAnimal));
    }
}
