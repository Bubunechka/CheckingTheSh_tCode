package org.example.lesson6;

public class MethOverload {

    int sum (int i1, int i2){
        return i1 + i2;
    }

    String sum (String s1, String s2){
        return s1 + s2;
    }

}

class MethOverloadTest{
    public static void main(String[] args) {
        MethOverload mO2 = new MethOverload();

        int a = mO2.sum(5,7);
        System.out.println(a);
        String s = mO2.sum("Krol", " Kolyan");
        System.out.println(s);

    }
}
