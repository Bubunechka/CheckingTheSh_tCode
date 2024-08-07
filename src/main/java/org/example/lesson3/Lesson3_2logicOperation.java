package org.example.lesson3;

public class Lesson3_2logicOperation {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int c = 5;

        boolean b1 = a > b;
        boolean b2 = a >= b;
        boolean b3 = a <= c;
        boolean b4 = a == b;
        boolean b5 = c != b;

//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);
//        System.out.println(b4);
//        System.out.println(b5);

        boolean x = true;
        boolean y = false;
        boolean z = true;

        //boolean result = x && y && z;
        boolean result = x || y || z;
        //System.out.println(result);

        boolean k = true;
        boolean m = false;

        int k1 = 10;
        int m1 = 50;
        int c1= 99;
        int d = 100;
        //boolean e = k1<m1 && c1++==d;
        boolean f = k1>m1 || ++c1 == d;

        int xx = 10;
        int yy = 5;
        //System.out.println(xx|yy);

        boolean bb1 = true;
        boolean bb2 = false;
        boolean bb3 = false;
        boolean bb4 = false;

        System.out.println(bb1 ^ bb2 ^ bb3 ^ bb4);





    }
}
