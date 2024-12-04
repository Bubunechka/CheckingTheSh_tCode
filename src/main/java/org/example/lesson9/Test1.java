package org.example.lesson9;

public class Test1 {

    int a = 1;
    static int B = 2;

    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test1 hw = new Test1();
        hw.abc(3);
    }

}
