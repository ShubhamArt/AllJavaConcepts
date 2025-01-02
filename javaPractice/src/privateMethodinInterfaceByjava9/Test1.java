package privateMethodinInterfaceByjava9;

public class Test1 {
    public static void main(String[] args) {

        //by anonymous class
        Calculator calculator=new Calculator() {
            @Override
            public void method1() {
                Calculator.super.method1();
            }

            @Override
            public void method2() {
                Calculator.super.method2();
            }
        };
        //or
        Calculator calculator1 = new Calculator() {};
        calculator1.method1();
        calculator1.method2();
    }
}
