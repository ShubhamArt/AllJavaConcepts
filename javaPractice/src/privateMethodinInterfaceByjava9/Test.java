package privateMethodinInterfaceByjava9;

import FunctionalInterfaceExampleImpl.Caculator;

public class Test {
    public static void main(String[] args) {
        Calculator calculator =new Calculator() {};
        System.out.println(calculator.add(6,7));
        System.out.println(calculator.substract(9,5));
        System.out.println(calculator.multiplyAndAdd(2,5,3));

        }
    }

