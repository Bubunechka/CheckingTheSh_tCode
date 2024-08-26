package org.example.lesson11;

public class Employee {

    public String name;
    public double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double uvelichenie(double a){
        a = a *= 2;
        return a;
    }

    public double zp(){
        salary = salary *= 2;
        return salary;
    }

}

class EmployeeTest{
    public static void main(String[] args) {

        Employee employee = new Employee("Ivan", 100.55);
        double d = employee.uvelichenie(employee.salary);
        System.out.println(d);
        System.out.println(employee.salary);
        System.out.println(employee.zp());
    }
}
