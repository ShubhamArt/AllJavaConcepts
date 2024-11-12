package designpatterns.structural.composite;
// Step 2: Create the Leaf class representing individual employees
public class Developer implements Employee{
    private String name;
    private String position;

    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println(name+ " is a "+position);
    }
}
