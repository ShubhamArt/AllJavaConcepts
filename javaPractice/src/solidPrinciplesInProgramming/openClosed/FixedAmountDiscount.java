package solidPrinciplesInProgramming.openClosed;

public class FixedAmountDiscount extends Discount {
    @Override
    public double apply(double price) {
        return price - 10; // $10 discount
    }
}
