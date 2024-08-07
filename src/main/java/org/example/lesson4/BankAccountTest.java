package org.example.lesson4;

class BankAccountTest {

    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 0;
        MyAccount.name = "Alenochka";
        MyAccount.balance = 1000.75;
        //MyAccount.popolnenyeScheta(7000);
        //MyAccount.snyatieSoScheta(35);

        YourAccount.id = 1;
        YourAccount.name = "Pechen'ka";
        YourAccount.balance = 17.80;

        HisAccount.id = 2;
        HisAccount.name = "Kofiy";
        HisAccount.balance = 30.10;


        MyAccount.popolnenyeScheta(20.5);





    }

}