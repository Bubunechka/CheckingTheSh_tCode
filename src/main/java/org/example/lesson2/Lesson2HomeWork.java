package org.example.lesson2;

public class Lesson2HomeWork {
    public static void main(String[] args) {

        //TODO 1
        //Все 4 переменные типа байт должны равняться 12и быть записаны в разных систеах счисления
        byte binary = 0b1100; // сначала ОБЯЗАТЕЛЬНО пишется 0b в бинарке перед числом
        byte decimal = 12; // десятичная - она и есть десятичная
        byte oct = 0_14; // в восьмиричной системе сначала пишется 0, затем число
        byte hex = 0x0C; // в 16-ричной сначала пишется 0х, затем переведенное число

        System.out.println(binary);
        System.out.println(decimal);
        System.out.println(oct);
        System.out.println(hex);

        // Все 4 переменные типа short должны равняться 1300 быть записаны в разных систеах счисления
        short binary1 = 0b10100010100;
        short decimal1 = 1300;
        short oct1 = 0_2424;
        short hex1 = 0x514;
        System.out.println(binary1);
        System.out.println(decimal1);
        System.out.println(oct1);
        System.out.println(hex1);

        // Все 4 переменные типа int должны равняться 0 быть записаны в разных систеах счисления
        int binary2 = 0b00;
        int decimal2 = 0;
        int oct2 = 0_00;
        int hex2 = 0x00;
        System.out.println(binary2);
        System.out.println(decimal2);
        System.out.println(oct2);
        System.out.println(hex2);

        //Все 4 переменные типа long должны равняться 123456789 быть записаны в разных систеах счисления

        long binary3 = 0b111010110111100110100010101L;
        long decimal3 = 123456789L;
        long oct3 = 0_726746425L;
        long hex3 = 0x75BCD15L;
        System.out.println(binary3);
        System.out.println(decimal3);
        System.out.println(oct3);
        System.out.println(hex3);

        //TODO 2
        //создать по 2 переменные на float, double, boolean и вывести их на экран

        float var1 = 256.7f;
        float var2 = 20F;
        double var3 = 8989.899d;
        double var4 = 7777.21d;
        boolean a1 = true;
        boolean a2 = false;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);

        //TODO 3
        // Создать н-ное количество переменных типа данных char всеми возможными способами и вывести ихи на экран

        char ch1 = 'a';
        char ch4 = 777;
        char ch6 = '\u0555';
        System.out.println(ch1);
        System.out.println(ch4);
        System.out.println(ch6);

    }

}
