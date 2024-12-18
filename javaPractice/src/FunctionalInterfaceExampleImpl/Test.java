package FunctionalInterfaceExampleImpl;

public class Test {
    public static void main(String[] args) {
        Square square = (int x) -> x * x;     //implementation of functional Interface

        int ans = square.calculate(3);

        System.out.println(ans);


        Caculator add = (a, b) -> a + b;
        System.out.println(add.calculate(5, 4));

        Caculator multiply = (a, b) -> a * b;
        System.out.println(multiply.calculate(5, 4));
    }
}
