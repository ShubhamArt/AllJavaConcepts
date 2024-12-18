package solidPrinciplesInProgramming.singleResponsibility;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Harry Potter");

        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport();
    }
}
