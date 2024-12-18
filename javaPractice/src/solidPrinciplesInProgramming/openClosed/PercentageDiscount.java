package solidPrinciplesInProgramming.openClosed;

public class PercentageDiscount extends Discount{
    private double discountPercentage;

    public PercentageDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount(double price) {
        return price - (price * discountPercentage / 100);
    }
}
