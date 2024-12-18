package defaultandStaticMethodJava8;

public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.makeSound();
        dog.sleep();

        Cat cat =new Cat();
        cat.makeSound();
        cat.sleep();

        System.out.println(MathOperation.add(5,3));
        System.out.println(MathOperation.multiply(3,2));
    }
}
