package org.example.lesson9;

public class Car {

    int k = 5;
    int $peremennaya = 10;
    int Name = 7;
    int _nameOfVar = 8;
    final int XYG = 7; // КОНСТАНТЫ ПИШУТСЯ С ЗАГЛАВНОЙ БУКВЫ


    String color;
    public static int a = 10;
    String engine;
    public static int count;

    public static void changeA(int b){
        //this.a = b; // ТАК НЕЛЬЗЯ. НЕЛЬЗЯ ИСПОЛЬЗОВАТЬ this ВНУТРИ СТАТИЧНЫХ МЕТОДОВ
        // Значение а можно поменят только создав новый объект и поменяется оно только для этого объекта
        Car car = new Car("White", "V12");
        car.a = b;
    }

    public Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
    }

    public  void showColor(){
        System.out.println("Цвет машины: " + color);
    }

//    public void changeColor (String color){
//        System.out.println("Цвет машины изменился");
//        int price = 5000; // local var
//        this.color = color;
//        price += 1000;
//
//    }


    void abc(int a, int b){
        boolean c = true; //TODO: тут ок
    }
    //TODO: Мы можем использовать диноковые наиименования переиенных в параметрах разных методов, потому что они
    // локально используются только там
    // НО! Называть новые переменные внутри метода также, как в параметре - НЕЛЬЗЯ
    void abcd(int a, int b){
       // boolean a = false; //TODO: Нельзя
        boolean c = true; //TODO: а так можно
    }

    void changeColor(String color){
        System.out.println(this.color);
    }


}

