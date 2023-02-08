package inheritancepolymorphism;

public class Program2 {

    public static void main(String[] args) {
        Manager manager = new Manager("Charlie Roberts", "Manager");

        Employee emp1 = new Employee("Terry Jerry", "Employee");
        Employee emp2 = new Employee("Jerry Mary", "Contracted Employee");
        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        SkilledWorker sw = new SkilledWorker("Jack Mary", "Skilled Worker");
        sw.addSkill("PHP");
        sw.addSkill("MongoDB");
        manager.addEmployee(sw);

        System.out.println(manager.getInfo());
    }

}
