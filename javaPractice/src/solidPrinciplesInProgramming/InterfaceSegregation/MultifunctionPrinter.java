package solidPrinciplesInProgramming.InterfaceSegregation;

public class MultifunctionPrinter implements PrintInterface, ScanInterface, FaxInterface{
    @Override
    public void printColor() {
        System.out.println("Printing color document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing document...");
    }
}
