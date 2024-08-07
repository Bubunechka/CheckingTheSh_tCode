package org.example.lesson5;

public class PracticeLess5 {
    public static void main(String[] args) {

        Lesson5 lesson5 = new Lesson5();
        int sumTrexChisel = lesson5.sum(1, 3, 4);
        int resultSredSum = lesson5.sredArifm(3, 4, 5);

//        System.out.println(sumTrexChisel);
//        System.out.println(lesson5.sum(3, 4, 8));
        System.out.println(resultSredSum);

        Car2 car2 = new Car2();
        car2.color = "purple";
        car2.engine = "V6";
        car2.speed = 60;
//        int uskorenie = car2.gaz(10);
//        int tormojenye = car2.tormoz(7);

        car2.info();
        car2.gaz(20);
        car2.info();
        car2.tormoz(7);
        car2.info();



    }
}
