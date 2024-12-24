package privateMethodinInterfaceByjava9;

public interface Calculator {
    default void method1() {
        commonLogic();  // Reuses common logic
        System.out.println("Method 1");
    }

    default void method2() {
        commonLogic();  // Reuses common logic
        System.out.println("Method 2");
    }

    private void commonLogic() {
        System.out.println("Common logic shared by both methods");
    }
}
