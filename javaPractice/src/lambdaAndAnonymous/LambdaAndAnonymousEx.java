package lambdaAndAnonymous;

public class LambdaAndAnonymousEx {
    public static void main(String[] args) {
        // Using a lambda expression to define the run method
        Runnable lambdaRunnable = () -> System.out.println("Hello from the Lambda!");

        // Running the lambda Runnable
        lambdaRunnable.run();

        // Using an anonymous class to define the run method
        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from the Anonymous Class!");
            }
        };

        // Running the anonymous class Runnable
        anonymousRunnable.run();

    }
}
