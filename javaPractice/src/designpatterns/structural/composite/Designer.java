package designpatterns.structural.composite;
// Step 3: Create another Leaf class for simplicity
public class Designer implements Employee{
    private String name;
    private String position;

    public Designer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println(name+ "is a"+position);
    }
}
