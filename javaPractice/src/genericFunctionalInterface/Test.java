package genericFunctionalInterface;

public class Test {
    public static void main(String[] args) {
        Adder<Integer> a = (num1, num2) -> num1 + num2;
        Integer ans = a.add(10, 5);
        System.out.println(ans);
    }
}
