package java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " " + salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = Arrays.asList(new Employee("Alice", 600000),
                new Employee("Bob", 50000),
                new Employee("charlie", 70000));
        employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println("sorted by salary:");
        employees.forEach(System.out::println);
    }
}
