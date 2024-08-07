package org.example.lesson3;

public class Lesson3 {
    public static void main(String[] args) {

        //int x = 1, y = 2,z = 3; - можно так писать, а ля упрощение, чтобы не писать несколько раз тип данных
//        int x = 1;
//        int y = 2;
//        int z = 3;

        //СЛОЖЕНИЕ
//        int a = 5;
//        int b = 10;
//        int c = a + b;
        //System.out.println(a + b);
        //System.out.println(c);

        //ВЫЧЕТАНИЕ
//        int d = b - a;
//        System.out.println(d);

        //TODO: С умножением тоже самое, мым можем как напрямую высчитывать результат между двумя переменными, так и выводить
        // результат через одну переменную, в которой уже содержится арифметическое действие
        //System.out.println(a * b);

        //ДЕЛЕНИЕ

        int a = 10;
        int b = 3;

        int c = a/b; //TODO:  при делении 10 на 3 мы получим 3,333333.... Так как int это целочисленный тип даных,
                     //TODO то остотак просто отбросится и выведется только тройка

        //System.out.println(c);

        double a1 = 11;
        double b1 = 3;
        double c1 = a1 / b1;

        //System.out.println(c1);

        int a2 = 11;
        int b2 = 3;

        int celayaChast = a2 / b2;
        int ostatok = a2 % b2;

        //System.out.println(celayaChast);
        //System.out.println(ostatok);

        double e = 5.5;
        double f = 3.5;
        double g = e % f;
        //System.out.println(g);

        int x = 5;
        int y = 3;

        //int z = x - y;
        int z1 = x - y++;
        //int z2 = x - ++y;

        //System.out.println(z); // 5-3=2
        System.out.println(z1); //
        //System.out.println(z2); // 5-(3+1) = 4
        System.out.println(y);


    }
}
