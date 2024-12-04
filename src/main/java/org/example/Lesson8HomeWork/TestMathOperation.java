package org.example.Lesson8HomeWork;

public class TestMathOperation {

    public static void main(String[] args) {

        //MathOperation mathOperation = new MathOperation(); - Это можно не делать, но вызывать надо из класса
        // (2 варианта), см ниже
        MathOperation.multiplication(3, 4, 7); //  без sout не выводит
        System.out.println(MathOperation.multiplication(3, 4, 7));

        MathOperation.division(10.5, 8.5);

        MathOperation.multiplication(7, 8, 29); //TODO: почему не выводит без sout?
        System.out.println(MathOperation.multiplication(3, 40, 7));
        MathOperation.division(75.7, 2.8);



    }

}
