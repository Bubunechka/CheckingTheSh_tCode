package org.example.lesson4;

public class Student {

    int numberOfStudentTicket;
    String name;
    String surName;
    int yearOfEducation;
    double averageScoreInMath;
    double averageScoreInEconomic;
    double averageScoreInForeignLanguage;

    Student(int numberOfStudentTicket, String name, String surName, int yearOfEducation, double averageScoreInMath,
            double averageScoreInEconomic, double averageScoreInForeignLanguage){

        this.numberOfStudentTicket = numberOfStudentTicket;
        this.name = name;
        this.surName = surName;
        this.yearOfEducation = yearOfEducation;
        this.averageScoreInMath = averageScoreInMath;
        this.averageScoreInEconomic = averageScoreInEconomic;
        this.averageScoreInForeignLanguage = averageScoreInForeignLanguage;

    }

    Student(int numberOfStudentTicket, String name, String surName, int yearOfEducation){

        this.numberOfStudentTicket = numberOfStudentTicket;
        this.name = name;
        this.surName = surName;
        this.yearOfEducation = yearOfEducation;

    }

    Student(){

    }


//    double priemAllparam(double ec, double math, double lang){
//        double resultSredney =  (averageScoreInEconomic + averageScoreInMath + averageScoreInForeignLanguage) / 3;
//        return resultSredney;
//
//    }

}


