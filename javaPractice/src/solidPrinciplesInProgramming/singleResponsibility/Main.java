package solidPrinciplesInProgramming.singleResponsibility;

public class Main {
    public static void main(String[] args) {

        Library library = new Library("City Library", "123 Main St");
        library.addBook("Clean Code");

        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport("Monthly");
    }
}
