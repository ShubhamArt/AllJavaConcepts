package solidPrinciplesInProgramming.DependencyInversion;

public class StripeGateway implements PaymentGateway {
    @Override
    public void charge(double amount) {
        System.out.println("Charging via Stripe: " + amount);
    }
}
