package org.example.lesson12;

public class Test11 {

//    void max(int i1, int i2, int i3){
//        if(i1 > i2 && i1 > i3){
//            int a = 5; // Этот а виден только внутри скобок этого if
//            System.out.println("max - " + i1);
//        } else if (i2 > i1 && i2 > i3) {
//            int a = 10; // Этот а виден только внутри скобок этого else
//                        // если не проинициализировать здесь переменную и сразу написать а = 10 - компилятор будет ругаться
//            System.out.println("max - " + i2);
//        } else{
//            System.out.println("max - " + i3);
//        }
//    }

    void abc(){
        String str;
        int a = 5;
        if(a >= 10){
            str = "Hello";
        }
        if(a < 10){
            str = "Bye";
        } else {
            str = null; // при отсутствии этого else, джава будет считать System.out.println(str); ошибкой компиляции.
            // Джаве все равно, что мы определили a, она предполагает тот момент, когда у нас str может неприянть
            // ни одно значение для этого прописываем else
            // Можно поставить null как альтернативное решение, а можно вписать своё
        }

        System.out.println(str);

    }



    public static void main(String[] args) {
        Test11 t = new Test11();

        //t.max(4, 7, 0);

        int a = 10;
        int b = 20;
        int maximum = (a > b) ? a : b;
        System.out.println(maximum);


    }
}
