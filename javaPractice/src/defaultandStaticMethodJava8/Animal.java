package defaultandStaticMethodJava8;

public interface Animal {
    // Default method
    default void sound() {
        System.out.println("Some generic animal sound");
    }

    // Static method
    static void info() {
        System.out.println("Animals are living beings.");
    }
}
