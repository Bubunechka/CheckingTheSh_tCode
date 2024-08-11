package org.example.lesson9;

public class Test2 {

    int a = 1;
    static int B = 2;

    static void abc(final int a){
        System.out.println(a);
        System.out.println(Test2.B);
    }

    public static void main(String[] args) {
        abc(5);
    }
}
