package designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
// Step 4: Create the Composite class that can hold multiple Employee objects
public class Manager implements Employee{
    private String name;
    private String position;
    List<Employee> subOrdinates;

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
        subOrdinates = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        subOrdinates.add(employee);
    }

    public void removeEmployee(Employee employee) {
        subOrdinates.remove(employee);
    }
    @Override
    public void showDetails() {
        System.out.println(name+" is a "+position+" and manages ");
        for(Employee emp:subOrdinates){
            emp.showDetails();
        }
    }
}
