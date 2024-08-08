package org.example.lesson7;

//TODO: Пересоздайте класс Employee таким образом, чтобы переменная salary была недоступна вне класса, переменная surname
// была доступна отовсюду, а переменная id только внутри пакета. Так же, создайте 3 public метода, которые будут показывать
// на дисплее значения этих переменных.
// Создайте для данного класса 3 разных конструктора с public, default, private модификаторами. В конструкторах присваивайте
// переменным класса значения из параметров.
// Создайте новые классы в том же и в другом пакете. Попытайтесь в них сосдать объекты класса Employee и вывести на экран
// значения переменных данного объекта с помощью метода println и методов самого класса

public class Employee {

    private double salary;
    public String surname;
    int id;

    public void showSalary(){
        System.out.println("ZP: " + salary);
    }

    public void showSurname(){
        System.out.println("Familiya: " + surname);
    }

    public void showId(){
        System.out.println("Id: " + id);
        //чтобы вывести это  метод через sout, требует, чтобы здесь был return
    }

    public Employee(double salary, String surname, int id){
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    Employee(int id, String surname, double salary){
        this.id = id;
        this.surname = surname;
        this.salary = salary;
    }

    private Employee(String surname, int id, double salary){
        this.surname = surname;
        this.id = id;
        this.salary = salary;
    }


}




// ЧТО ТО ВАЖНОЕ С УРОКА:

//    public void dvoynayaZP(){
//        double result = salary * 2; // это inctance переенная (есть ссылочные, а есть которые прост присваивают)
//                                    // такой переменной модификаторы доступа не ставят
//        System.out.println("Novaya ZP " + result);
//    }
//
//    public Employee (double salary2){
//        this.salary = salary2;
//    }
//
//    public static void main(String[] args) {
//
//        Employee employee = new Employee(70);
//        System.out.println(employee.salary);
//        employee.dvoynayaZP();
//    }