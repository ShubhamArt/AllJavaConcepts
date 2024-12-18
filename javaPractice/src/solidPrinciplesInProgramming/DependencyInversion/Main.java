package solidPrinciplesInProgramming.DependencyInversion;

public class Main {
    public static void main(String[] args) {
        PaymentGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeProcessor = new PaymentProcessor(stripeGateway);
        stripeProcessor.processPayment(100.0);  // Output: Charging via Stripe: 100.0

        PaymentGateway paypalGateway = new PaypalGateway();
        PaymentProcessor paypalProcessor = new PaymentProcessor(paypalGateway);
        paypalProcessor.processPayment(200.0);  // Output: Charging via PayPal: 200.0
    }
}
