package designpatterns.creational.singleton;

public class Animal {
    // Volatile instance to ensure visibility in multithreaded environments
    private static volatile Animal instance;

    // Private constructor to prevent instantiation from outside
    private Animal() {

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


}


