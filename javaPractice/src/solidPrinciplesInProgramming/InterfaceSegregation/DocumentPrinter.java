package solidPrinciplesInProgramming.InterfaceSegregation;

public class DocumentPrinter implements PrintInterface {
    @Override
    public void printDocument(String content) {
        System.out.println("Printing document: " + content);
    }
}
