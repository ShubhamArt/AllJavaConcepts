package privateMethodinInterfaceByjava9;

public class Test implements Calculator {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.method1();  // Calls the first default method
        obj.method2();  // Calls the second default method


    }
}
