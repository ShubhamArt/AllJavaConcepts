package solidPrinciplesInProgramming.openClosed;

public class Main {
    public static void main(String[] args) {
        Discount fixedDiscount = new FixedAmountDiscount(50);
        Discount percentageDiscount = new PercentageDiscount(10);

        System.out.println("Fixed Discount: " + fixedDiscount.applyDiscount(500));
        System.out.println("Percentage Discount: " + percentageDiscount.applyDiscount(500));
    }
}
