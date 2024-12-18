package solidPrinciplesInProgramming.openClosed;

public class Main {
    public static void main(String[] args) {
        Discount percentageDiscount = new PercentageDiscount();
        System.out.println("Price after percentage discount: " + percentageDiscount.apply(100));

        Discount fixedAmountDiscount = new FixedAmountDiscount();
        System.out.println("Price after fixed discount: " + fixedAmountDiscount.apply(100));
    }
}
