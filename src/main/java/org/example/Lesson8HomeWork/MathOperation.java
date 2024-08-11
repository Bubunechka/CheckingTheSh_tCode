package org.example.Lesson8HomeWork;

public class MathOperation {
    int a;
    int b;
    int c;

    static int multiplication(int a, int b, int c){
        int mult = a * b * c;
        return mult;
    }

    static void division(double d, double e){ // если не стоит тип данных - тогда и не будет ничего возвращать? когда стоял дабл просил ретерн
        double div = d / e;
        System.out.println("Результат деления с полным частным и остатком: " + div);
    }


}
