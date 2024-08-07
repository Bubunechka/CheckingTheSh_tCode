package org.example.lesson3;

public class Lesson3HomeWork {
    public static void main(String[] args) {

        // ex 1
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1/3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;

        System.out.println(result);

        // ex 2

        int a = 5;
        int res1 = a-- - --a + ++a + a++ + a;
        System.out.println(res1);

        int b = 8;
        int res2 = ++b - b++ + ++b - --b;
        System.out.println(res2);


    }



}
