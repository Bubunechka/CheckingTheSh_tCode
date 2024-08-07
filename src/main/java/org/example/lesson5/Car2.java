package org.example.lesson5;

public class Car2 {

    Car2 (){ // дефолтный конструктор класса

    };

    String color;
    String engine;
    int speed;

    int gaz(int skorost){
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost){
        speed -= skorost;
        return speed;
    }

    void info(){
        System.out.println("Cvet: " + color + " Motor: " + engine + " skorost: " + speed);
    }


}
