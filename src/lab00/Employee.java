package lab00;

public class Employee {
    private String name;
    private int age;
    private String designation;
    private int salary;




    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }
    public Employee(int salary){
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getDesignation(){
        return designation;
    }
    public int getSalary(){
        return salary;
    }
    public  void printEmployee(){

        System.out.println("Details of the employee named: "+getName()+"\n"+"Age: "+getAge()+"\n"+"Designation: "+getDesignation()+"\n"+"Salary: "+getSalary());

    }
}
