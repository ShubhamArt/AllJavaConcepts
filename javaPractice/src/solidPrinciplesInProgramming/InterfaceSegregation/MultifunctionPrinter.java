package solidPrinciplesInProgramming.InterfaceSegregation;


public class MultifunctionPrinter implements PrintInterface, ScanInterface, FaxInterface {
    @Override
    public void printDocument(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scanDocument(String content) {
        System.out.println("Scanning: " + content);
    }

    @Override
    public void sendFax(String content) {
        System.out.println("Sending fax: " + content);
    }
}