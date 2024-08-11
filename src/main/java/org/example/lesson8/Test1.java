package org.example.lesson8;

public class Test1 {

    public final int a;

    Test1(){
        a = 10;

    }

    Test1(boolean b){
        a = 15;
    }

    public void abc(final short s){
        final byte b = 10; // lockal еременная
        System.out.println(s+b);
    }

    public static void main(String[] args) {

        Test1 test1 = new Test1();
        //test1.a = test1.a * 2;
        System.out.println(test1.a);

    }

}
