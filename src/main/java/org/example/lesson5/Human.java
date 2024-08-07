package org.example.lesson5;

public class Human {

    // переменные ниже - ссылочные типы данных
    String name;
    Car4 car;
    BankAccount bA;

    void info(){
        System.out.println("Name: " + name + "color machine " + car.color
                + "Bank balance: " + bA.balance);
    }

    public static void main(String[] args) {
        Human h = new Human(); // объявляем конструктор на Human
        h.name = "David"; // тут понятно
        h.car = new Car4("red", "v8"); // здесь мы через точку хьюмана ссылаемся на метод машины в ее класе и
        // с учетом атрибутов всьавляем данные, котороые хотим присвоить
        h.bA = new BankAccount(007, 500.57); // здесь тоже самое
        h.info();

    }


}
