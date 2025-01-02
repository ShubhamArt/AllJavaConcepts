package FunctionalInterfaceEx;

public class Calculator {
    public static void main(String[] args) {
        //by using lambda expression we are providing implementation of Functional interface
        Test test=n->n*n;
        System.out.println(test.square(5));
    }
}
