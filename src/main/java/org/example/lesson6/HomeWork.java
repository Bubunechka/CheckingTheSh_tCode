package org.example.lesson6;

public class HomeWork {

    //TODO:  Создать класс, в котором 5 оверлоад методов, которые вычисляют сумму нуля, одного, двух, трех и 4-х целых
    // числел соответственно, передают эту сумму в аутпут и выводят ее на экран. В случае, когда слагаемые отсутствуют,
    // (окгда параметров нет) сумма пусть равняется 0

    // Сумма 2-х
    int sum (int a, int b){
        int result1 = a + b;
        return result1;
    }

    //Сумма 3-х
    int sum(int a, int b, int c){
        int result2 = a + b + c;
        return result2;
    }

    // Сумма 4-х
    int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

    // Сумма 1-го
    int sum (int a){
        int result4 = a;
        return result4;
    }

    int sum (){
        int result5 = 0;
        return result5;
    }

}

class Proverka{

    public static void main(String[] args) {

        HomeWork homeWork = new HomeWork();
        int summary = homeWork.sum(7, 5);
        System.out.println(summary);

        int summary1 = homeWork.sum(3, 4, 5);
        System.out.println(summary1);

        int summaty2 = homeWork.sum(2,2, 4, 4);
        System.out.println(summaty2);

        int summary3 = homeWork.sum(12);
        System.out.println(summary3);

        int summary4 = homeWork.sum();
        System.out.println(summary4);

        System.out.println(homeWork.sum(6));


    }
}
