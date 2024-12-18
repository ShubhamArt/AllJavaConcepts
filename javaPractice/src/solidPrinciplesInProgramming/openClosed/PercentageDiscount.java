package solidPrinciplesInProgramming.openClosed;

public class PercentageDiscount extends Discount{
    @Override
    public double apply(double price) {
        return price * 0.9; // 10% discount
    }
}
