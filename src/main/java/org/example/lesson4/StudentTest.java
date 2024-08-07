package org.example.lesson4;

public class StudentTest {

    public static void main(String[] args) {

        Student stud1 = new Student();
        Student stud2 = new Student();
        Student stud3 = new Student();

        stud1.numberOfStudentTicket = 001;
        stud1.name = "Vasya";
        stud1.surName = "Pypkin";
        stud1.yearOfEducation = 2020;
        stud1.averageScoreInMath = 3.99;
        stud1.averageScoreInEconomic = 4.5;
        stud1.averageScoreInForeignLanguage = 5;
        //double average1 = (3.9 + 4.5 + 5) / 3;
        double st1 = stud1.srednuaya(3.99, 4.5, 5);


        stud2.numberOfStudentTicket = 002;
        stud2.name = "Peter";
        stud2.surName = "Popkin";
        stud2.yearOfEducation = 2023;
        stud2.averageScoreInMath = 4.99;
        stud2.averageScoreInEconomic = 4.32;
        stud2.averageScoreInForeignLanguage = 2.91;
        //double average2 = (4.9 + 4.32 + 2.91) / 3;
        double st2 = stud2.srednuaya(4.99, 4.32, 2.91);

        stud3.numberOfStudentTicket = 003;
        stud3.name = "Kolyan";
        stud3.surName = "Krolykov";
        stud3.yearOfEducation = 2024;
        stud3.averageScoreInMath = 4.91;
        stud3.averageScoreInEconomic = 5.00;
        stud3.averageScoreInForeignLanguage = 5.00;
        //double average3 = (4.91 + 5 + 5) / 3;
        double st3= stud3.srednuaya(4.91, 5, 5);

        System.out.println("sred 1-go: " + st1 + " sred 2-go: " + st2);

//        System.out.println("Средняя арифметическая Васи Пупкина: " + average1);
//        System.out.println("Средняя арифметическая Петра Попкина: " + average2);
//        System.out.println("Средняя арифметическая Коляна Кролькова: " + average3);


//        System.out.println("Средняя арифметическая Васи Пупкина: " + stud1.name + stud1.surName + "="
//                + (stud1.averageScoreInMath + stud1.averageScoreInEconomic + stud1.averageScoreInForeignLanguage) / 3);

    }


}
