package org.example.lesson4;

public class BankAccount {

    int id = 10; // лучше лонг
    String name = "Petr";
    double balance = 100;

    void popolnenyeScheta (double summaPopolneniya){
        System.out.println("Balance do:" + balance);
        System.out.println("Balance popolnyaetsya na: " + summaPopolneniya);
        balance += summaPopolneniya;
        System.out.println("Balance posle popolneniya: " + balance);
    }

    // на минус делать не буду




    // Рабочая [eqyz, которую заговнил Мистер Сеньор помидор
//    double popolnenyeScheta(double y) {
//        double yvelichivaemNa = balance += y;
//        return yvelichivaemNa;
//    }
//
//    double snyatieSoScheta (double w) {
//        double snimaem = balance -= w;
//        return snimaem;
//    }



}

//    public static void main(String[] args) {
//
//        BankAccount MyAccount = new BankAccount();
//        //TODO у нас есть класс шаблон с переменными BankAccount
//         мы хотим создать экземпляр класса (объект) с новым названием bAcc
//        // после равно мы пишем new - потому что создаем новый класс по тому же шаблону(new BankAccount)
//        // new BankAccount(); - это вызов конструктора, создание нового объекта
//        // создание нового объекта класса BankAccount
//
//        BankAccount YourAccount = new BankAccount();
//        BankAccount HisAccount = new BankAccount();
//
//        MyAccount.id = 0;
//        MyAccount.name = "Alenochka";
//        MyAccount.balance = 1000.75;
//
////        System.out.println(MyAccount.name);
////        System.out.println(HisAccount.balance); // 0.0 поотому что незадано значение для баланса на его акк.
//        // Выводит дефолтное значение - по умолчанию 0.0 (с точкой, потому что у нас double)
//
//        YourAccount.id = 1;
//        YourAccount.name = "Pechen'ka";
//        YourAccount.balance = 17.80;
//
//        HisAccount.id = 2;
//        HisAccount.name = "Kofiy";
//        HisAccount.balance = 30.10;
//
//
//    }


