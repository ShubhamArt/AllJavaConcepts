package oops.multipleInheritance;

public class Test implements I1,I2{
    @Override
    public void show() {
        System.out.println("1");
    }

    @Override
    public void display() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.display();
        t.show();
    }
}
