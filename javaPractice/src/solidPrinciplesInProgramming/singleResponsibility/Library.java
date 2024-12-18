package solidPrinciplesInProgramming.singleResponsibility;

public class Library {
    private String name;
    private String address;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addBook(String book) {
        System.out.println("Adding book: " + book);
    }
}
