package org.example.Lesson7_1;


import org.example.lesson7.Employee;

public class lesson7EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee(120.5, "Ivan", 9);
        System.out.println("Здесь мы видим значения переменных потому, что вызываем методы, которые имеют модификатор " +
                "доступа P U B L I C," +
                " \nв которых прописана строка с выводом переменной, куда позже при вызове конструктора (обозначения класса) " +
                "мы вставим значения переменных: ");
        employee1.showSalary();
        employee1.showSurname();
        employee1.showId();

        System.out.println("Здесь мы увидим только фамилию, потому что ее модификатор доступа позволяет видеть ее везде");
        System.out.println("Id  не будет выведен, потому что его область видимости ограничена одним пакетом, если хотим " +
                "его увидеть - надо делать его public ");

        System.out.println("Familiya  - " + employee1.surname + ", Zorplata - не будет " +
                "выведена, так как она имеет модификатор доступа PRIVATE - она ограничена по видимости своим классом");

    }
}
