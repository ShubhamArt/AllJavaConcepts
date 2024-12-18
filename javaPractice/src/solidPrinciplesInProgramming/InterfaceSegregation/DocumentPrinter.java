package solidPrinciplesInProgramming.InterfaceSegregation;

public class DocumentPrinter implements PrintInterface{
    @Override
    public void printColor() {
        System.out.println("Printing color document...");
    }
}
