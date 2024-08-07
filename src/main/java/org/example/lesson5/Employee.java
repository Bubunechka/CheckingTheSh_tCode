package org.example.lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;


    Employee (int id2, String surname2, int age2, double salary2, String department2){

        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
        // значения переменных присваиваем их атрибутам

//        this.id = id;
//        this.surname = surname;
//        this.age = age;
//        this.salary = salary;
//        this.department = department;
    }

        double moreMoney (){
        salary *= 2;
        return this.salary;
    }

//    double moreMoney (double salary){
//        this.salary *= salary;
//        return this.salary;
//    }

    void info(){
        System.out.println("Id: " + id + " Surname: " + surname + " Salary: " + salary);
    }


}
