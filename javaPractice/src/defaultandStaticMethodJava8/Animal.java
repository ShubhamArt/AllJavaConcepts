package defaultandStaticMethodJava8;

public interface Animal {
    void makeSound(); //abstract method

    default void sleep(){
        System.out.println("This animal is sleeping ");
    }
}
