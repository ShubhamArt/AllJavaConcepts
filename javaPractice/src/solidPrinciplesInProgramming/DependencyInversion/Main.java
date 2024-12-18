package solidPrinciplesInProgramming.DependencyInversion;

public class Main {
    public static void main(String[] args) {
        PaymentGateway paypal = new PaypalGateway();
        PaymentProcessor processor = new PaymentProcessor(paypal);
        processor.process(100);

        PaymentGateway stripe = new StripeGateway();
        processor = new PaymentProcessor(stripe);
        processor.process(200);
    }
}
