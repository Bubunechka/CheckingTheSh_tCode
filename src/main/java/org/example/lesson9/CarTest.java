package org.example.lesson9;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Green", "V6");


        System.out.println(car.color);
        car.changeColor("Tiffany");
        System.out.println(car.color);

    }
}
