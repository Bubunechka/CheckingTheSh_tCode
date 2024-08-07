package org.example.lesson6;

// TODO ПЕРЕГРУЗКА МЕТОДОВ = ЭТО КОГДА У НАС МНОГО МЕТОДОВ С ОДИНАКОВЫМИ НАЗВАНИЯМИ (но не параметрами внутри них,
//  это и так работать не будет)

public class MethodOverloading {

    void show(int i1){ //TODO: эти три метода делают одно и тоже. Если их будет +100500, можно будет легко запутаться
                          //TODO по этому, мы будем делать ПЕРЕГРУЗКУ МЕТОДОВ (Overloading);. Назовем все эти методы
                          // одним названием (было showBool, showString etc )
                          // Мы теперь знаем, что все эти методы show будут выводить что то на экран (то, что мы им передадим
                          // в параметр)
        System.out.println(i1);
        System.out.println("data type is Int");
    }
    void show(boolean b1){
        System.out.println(b1);
        System.out.println("data type is Boolean");
    }
    void show(String s1){
        System.out.println(s1);
        System.out.println("data type is String");
    }

    void show (int a, int b){   //TODO ИМЕНА И ПАРАМЕТРЫ ОДИНАКОВЫМИ БЫТЬ НЕ МОГУТ
        System.out.println(a);
        System.out.println("data type is Int");
    }

    void show (String s, int a){
        System.out.println("String : " + s + "int : " + a);
    }

    void show (int a, String s){
        System.out.println("How is beautiful day!"); // пока не вызовешь этот метод, когда (!) вызовешь этот метод
                                                     // тогда и появится эта строка
    }

}

class MethodOverloadingTest{

    public static void main(String[] args) {

        MethodOverloading mO = new MethodOverloading();
//        int a = 500; // можно не прописыват это, а сразу присать в нижнюю строчку
//        mO.show(a);
//
//        boolean b = true;
//        mO.show(b);
//
//        String s = "hello";
//        mO.show(s);

        mO.show("heool ", 10);
        mO.show("parrot ", 2);
        mO.show(4, "apple");

    }

}
