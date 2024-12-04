package org.example.lesson7;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee(100.0, "Petrov", 7);
        employee.showSalary();
        employee.showSurname();
        employee.showId();

        System.out.println("Id pipla - " + employee.id + " Familiya pipla - " + employee.surname + " Zorplata - не будет выведена, так как она имеет модификатор доступа PRIVATE");



    }

}
