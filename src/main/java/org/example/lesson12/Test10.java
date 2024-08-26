package org.example.lesson12;

public class Test10 {

    public static void main(String[] args) {

        int salary = 300;
        boolean b = true;

//        if (salary >= 500){
//            System.out.println(":)");
//        } else {
//            System.out.println("no, thanks");
//        }

        if (salary < 200){
            System.out.println("zp nizka");
        } else if(salary < 400 && b == false || true){
            System.out.println("zp srednego razmera");
        } else if(salary< 600) {
            System.out.println("zp vysokaya");
        } else if(b==true) {
            System.out.println("zp perfect");
        }
//        } else{
//            System.out.println("zp perfect");
    }

}


