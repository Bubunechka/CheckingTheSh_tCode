package org.example.lesson6;

public class Employee {

//    Employee(int id2, String surname2, int age2){
//        this(surname2, age2);
//        id = id2;
//    }
//
//    //Для кандидатов, не работников
//    Employee(String surname3, int age3){
//        surname = surname3;
//        age = age3;
//    }
//
//    Employee(int id4, String surname4, int age4, double salary4, String department4){
//        this(id4, surname4, age4); //TODO: чтобы так использовать this, надо чтобы эта строка стояла первым выражением
//        id = id4;
//        salary = salary4;
//        department = department4;
//
//    }

    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id, String surname, int age){
        this(id, surname, age, 0.0, null);
        // когда вызываем конструктор с большим содержимым, который в себя все включает - дописываем элементы
        // по их значениям (double - 0.0, String - null etc.)
    }

    public Employee(String surname, int age){
        this(0, surname, age, 0.0, null);

    }

    Employee(int id, String surname, int age, double salary, String department){
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;

    }



}

class EmployeeTest{
    public static void main(String[] args) {

        Employee emp = new Employee(1, "Ivanov", 25);//TODO^ после написания конструктора Employee с параметрами,
                                      // мы не можем написать этот конструктор, потому что как только мы
                                       //определили свой конструктор - дефолтный уходит автоматически
                                      //TODO Кактолько мы опрелеляем свой конструктор - дефолтный автоматически перестает существовать
        //System.out.println(emp.id);
        Employee emp2 = new Employee("Petros", 30);

        System.out.println(emp2.surname);
        System.out.println(emp2.department);

        Employee emp3 = new Employee(2, "Aivazovskiy", 27, 250, "IT");

        System.out.println(emp3.department);
    }
}
