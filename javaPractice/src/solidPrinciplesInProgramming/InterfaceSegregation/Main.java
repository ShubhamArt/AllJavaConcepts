package solidPrinciplesInProgramming.InterfaceSegregation;

public class Main {
    public static void main(String[] args) {
        DocumentPrinter documentPrinter = new DocumentPrinter();
        documentPrinter.printColor();

        MultifunctionPrinter multifunctionPrinter = new MultifunctionPrinter();
        multifunctionPrinter.printColor();
        multifunctionPrinter.scan();
        multifunctionPrinter.fax();
    }
}
