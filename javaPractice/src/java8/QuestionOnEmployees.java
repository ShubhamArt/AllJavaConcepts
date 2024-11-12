package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuestionOnEmployees {
    public static void main(String[] args) {
        List<Employee> employees1 = new ArrayList<>();
        employees1.add(new Employee(1, "ram", "pune", 3546.00, "HR", 25,"Male"));
        employees1.add(new Employee(2, "sham", "mumbai", 47567.90, "PROD", 30,"male"));
        employees1.add(new Employee(5, "sneha", "pune", 7586.09, "HR", 37,"female"));
        employees1.add(new Employee(6, "sneha", "goa", 98600.09, "MAINTENANCE", 29,"female"));
        employees1.add(new Employee(3, "ketan", "katraj", 4953.09, "TRAINING", 30,"male"));
        employees1.add(new Employee(7, "ketan", "solapur", 8900.04, "Supoort", 40,"male"));
        employees1.add(new Employee(4, "yogesh", "phaltan", 8575.00, "Engine", 45,"male"));
        employees1.add(new Employee(8, "Amit", "phaltan", 8575.00, "Engine", 45,"male"));

        //find all employees who lives in city 'pune' sort them by their name and print the names of employee
        employees1.stream().filter(e -> e.getCity().equalsIgnoreCase("pune"))
                .sorted(Comparator.comparing(Employee::getName)).forEach(e -> System.out.println(e.getName()));

        //find the occurance of names of employees and find the frequency of each name

        Map<String, Long> answer = employees1.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        System.out.println(answer);

        //find the highest salary of an employee from HR department
        Optional<Employee> maxSalaryEmployee = employees1.stream().filter(e -> e.getDepartment().equalsIgnoreCase("HR"))
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println(maxSalaryEmployee);

        //merge two employees arraylist and sort them based on age in ascending order
        List<Employee> employees2 = new ArrayList<>();
        employees2.add(new Employee(1, "kavita", "pune", 3546.00, "HR", 34,"female"));
        employees2.add(new Employee(2, "bapu", "mumbai", 47567.90, "PROD", 50,"male"));
        employees2.add(new Employee(5, "shamu", "pune", 7586.09, "HR", 36,"male"));
        employees2.add(new Employee(6, "sakshi", "goa", 98600.09, "MAINTENANCE", 49,"female"));
        employees2.add(new Employee(3, "rudra", "katraj", 4953.09, "TRAINING", 50,"male"));
        employees2.add(new Employee(7, "aish", "solapur", 8900.04, "Supoort", 45,"female"));
        employees2.add(new Employee(4, "nayana", "phaltan", 8575.00, "Engine", 46,"female"));

        List<Employee> mergedEmpList = Stream.concat(employees1.stream(), employees2.stream()).sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
        System.out.println("Employees based on age in asc order"+mergedEmpList);

      //find the names of employees whose name starts with A
        List<Employee> employessWithNameA = employees1.stream().filter(e -> e.getName().startsWith("A")).collect(Collectors.toList());
        System.out.println(employessWithNameA);

        //sort employees based on name and salary
        List<Employee> sortedEmployess = employees1.stream().sorted(Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(sortedEmployess);

        //sort employees names based on alphabet A and sort in descending order
        List<Employee> filteredAndSortedEmp = employees1.stream().filter(e -> e.getName().startsWith("A")).sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());
        System.out.println("employees names based on alphabet A and sort in descending order = "+filteredAndSortedEmp);

        //sort employees based on gender and age above 30

        List<Employee> sortedEmployees = employees1.stream().filter(e -> e.getAge() > 30).
                sorted(Comparator.comparing(Employee::getGender)).collect(Collectors.toList());
        System.out.println(sortedEmployees);

        //find the employees count in each department in employee list

        Map<String, Long> empCountByDept = employees1.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("Employees count by each department ="+empCountByDept);

        //find employees based on city and sort in alphabetical manner
        List<Employee> filteredEmpl = employees1.stream().filter(e -> e.getCity().equalsIgnoreCase("pune")).sorted(Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getGender).reversed()).collect(Collectors.toList());
        System.out.println(filteredEmpl);
    }
}
