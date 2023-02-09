package Inheritance_Polymorphism;

import java.util.ArrayList;

public class Manager extends Employee {
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public Manager(String name, String jobTitle) {
        super(name, jobTitle);
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public String getInfo() {
        String info = super.getInfo();
        for (Employee emp : employees) {
            info += emp.getInfo();
        }
        return info;
    }
}
