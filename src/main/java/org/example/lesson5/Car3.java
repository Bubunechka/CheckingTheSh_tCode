package org.example.lesson5;

public class Car3 {

//    Car3(String cvet, String motor){ // здесь мы пишем значения для переменных color и engine
//        color = cvet; // присваиваем в теле конструктора
//        engine = motor;
//
//    }

    Car3(String cvet, String motor){
        //System.out.println("object is created");
//        color = "blue";
//        engine = "VVVVVV120";
        color = cvet;
        engine = motor;

        System.out.println("Цвет машины: " + color + " Мотор " + engine);

    }

    String color;
    String engine;


    public static void main(String[] args) {

//        Car3 car3 = new Car3("red", "V8"); // создаем новый объект (объявляем конструктор) в атрибуты которого
//                                                       // просписываем значения этих переменных
        Car3 car3 = new Car3("yellow", "VVVVVV897876");
        Car3 car4 = new Car3("white", "VVVV2123232");
//        System.out.println(car3.color);
//        System.out.println(car3.engine);

        //TODO При отсутствии аргументов и параметров в конструкторах, java смотит в конструктори смотит, что есть в теле
        // при выполнении видит саут, который выволит на экран строку и выводит эту строку на экран


    }





}
