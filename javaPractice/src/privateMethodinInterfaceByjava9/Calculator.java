package privateMethodinInterfaceByjava9;

public interface Calculator {
    default  int add(int a,int b){
        return a+b;
    }
    default int substract(int a, int b){
        return a-b;
    }
    //private helper method
    private int multiply(int a, int b){
        return a*b;
    }

    default int multiplyAndAdd(int a,int b,int c){
        return multiply(a,b)+add(a,c);
    }
}
