package lab00;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee Employee1 = new Employee("Mehmet",20,"thisisadesignation");
        Employee Employee2 = new Employee("Aydan",21,"thisisanotherdesignation");
        Employee1.setSalary(125000);
        Employee2.setSalary(50000);

        Employee1.printEmployee();
        Employee2.printEmployee();
    }
}
