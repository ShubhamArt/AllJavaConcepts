package designpatterns.structural.composite;
// Step 5: Use the Composite Pattern
public class CompositePatternDemo {
    public static void main(String[] args) {
        // Leaf objects
        Developer dev1 = new Developer("Alice", "Frontend Developer");
        Developer dev2 = new Developer("Bob", "Backend Developer");
        Designer des1 = new Designer("Charlie", "UI Designer");

        // Composite object
        Manager manager = new Manager("Eve", "Project Manager");

        // Add leaf objects to the composite
        manager.addEmployee(dev1);
        manager.addEmployee(dev2);
        manager.addEmployee(des1);

        // Display the composite structure
        manager.showDetails();
    }
}
