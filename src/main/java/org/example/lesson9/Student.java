package org.example.lesson9;

public class Student {
}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3; // Когда нет обращения к конструктору - объект не создается
        st1 = null;
    }
}