package solidPrinciplesInProgramming.InterfaceSegregation;

public class Main {
    public static void main(String[] args) {
        PrintInterface printer = new DocumentPrinter();
        printer.printDocument("Hello World!");

        MultifunctionPrinter mfp = new MultifunctionPrinter();
        mfp.printDocument("Multifunction Printer");
        mfp.scanDocument("Scan Content");
        mfp.sendFax("Fax Content");
    }
}
