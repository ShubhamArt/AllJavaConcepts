package solidPrinciplesInProgramming.DependencyInversion;

public class PaypalGateway implements PaymentGateway {
    @Override
    public void charge(double amount) {
        System.out.println("Charging via PayPal: " + amount);
    }
}
