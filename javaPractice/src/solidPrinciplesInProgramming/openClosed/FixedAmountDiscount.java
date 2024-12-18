package solidPrinciplesInProgramming.openClosed;

public class FixedAmountDiscount extends Discount {
    private double discountAmount;

    public FixedAmountDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double price) {
        return price - discountAmount;
    }
}
