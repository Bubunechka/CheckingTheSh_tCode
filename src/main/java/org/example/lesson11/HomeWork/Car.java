package org.example.lesson11.HomeWork;

public class Car {

    String color;
    String engine;
    int quantityOfDoor;

    public Car(String color, String engine, int quantityOfDoor){
        this.color = color;
        this.engine = engine;
        this.quantityOfDoor = quantityOfDoor;
    }

    // TODO Почему не правильно?
//    public static int changeQuantityOfDoor(int door) {
//        door = door *= 2;
//        return door;
//    }

//        public static void changeColor(String color){
//            String chgeColor =
//        }
}

    class CarTest{

//    void changeDoorCount(Car car, int door){
//        car.quantityOfDoor = quantityOfDoor;
//    }

        public static void main(String[] args) {

            Car car = new Car("white", "V8", 2);
//            car.changeQuantityOfDoor(2);
//            System.out.println(car.quantityOfDoor);



        }
    }


