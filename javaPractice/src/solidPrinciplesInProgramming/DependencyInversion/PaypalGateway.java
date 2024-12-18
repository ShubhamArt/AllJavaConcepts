package solidPrinciplesInProgramming.DependencyInversion;

public class PaypalGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal.");
    }
}
