package designpatterns.creational.singleton;
//Singleton Pattern: The getInstance() method implements double-checked locking to ensure that Animal is
// instantiated only once in a thread-safe manner.
//Private Constructor: The private constructor prevents instantiation from outside, enforcing a single instance.
//Default Properties: The species and name properties have default values, but they can be
// changed using setter methods.
public class Animal {
    // Volatile instance to ensure visibility in multithreaded environments
    private static volatile Animal instance;

    // Private fields for Animal properties (e.g., species and name)
    private String species;
    private String name;

    // Private constructor to prevent instantiation from outside
    private Animal() {
        this.species = "Lion"; // Default species
        this.name = "Simba";   // Default name
    }

    // Public method to provide access to the single instance
    public static Animal getInstance() {
        if (instance == null) { // Check 1
            synchronized (Animal.class) { // Synchronize only for the first time
                if (instance == null) { // Check 2
                    instance = new Animal();
                }
            }
        }
        return instance;
    }

    // Getter and Setter methods for properties
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Example method to demonstrate functionality
    public void makeSound() {
        System.out.println(name + " the " + species + " says: Roar!");
    }
}


