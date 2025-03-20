package ThreadCreationWays;

public class UsingLambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Thread running by Lambda expression"));
        t1.start();
    }
}
