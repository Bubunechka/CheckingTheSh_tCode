package org.example.lesson8;

public class Car {
    String color = "blue";
    String engine = "V8";

}

class Human{
    String name = "Ivan";
    Car c = new Car();
    // Если бы Car был final, мы бы не смогли в psvm создавать новые машины и менять мотор - h1.c.engine
    // Если final, мы не сможем изменить адрес с и создать новую машину

    public static void main(String[] args) {

        Human h1 = new Human();
        h1.c = new Car();
        h1.c = new Car();
        h1.c.engine = "V12"; // Но мотор мы можем поменять, потому что это никак не меняет адрес с

    }

}
