package org.example.Lesson8HomeWork;


public class CircleArea {

    static final double pi = 3.14;

    double circle(double r){
        double s = pi * r * r;
        //System.out.println("Площадь круга в первом non-static методе равна "+ s);
        return s;
    }

     static double dlinaCircle(double r){
        double dlina = 2 * pi * r;
        //System.out.println("Длина окружности в ststic методе " + dlina);
        return dlina;
    }

    void result(double r){
        System.out.println("Радиус в общем методе  = " + r);
        System.out.println("Площадь круга в общем методе = " + dlinaCircle(7));
        System.out.println("Длина окружности в общем методе = " + dlinaCircle(7));
    }

    //Он сделал:
//    public void info(double r){
//        System.out.println("Радиус в общем методе  = " + r);
//        System.out.println("Площадь круга в общем методе = " + dlinaCircle(7));
//        System.out.println("Длина окружности в общем методе = " + dlinaCircle(7));
//    }

}
