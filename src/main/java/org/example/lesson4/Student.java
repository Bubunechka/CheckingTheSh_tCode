package org.example.lesson4;

public class Student {

    int numberOfStudentTicket;
    String name;
    String surName;
    int yearOfEducation;
    double averageScoreInMath;
    double averageScoreInEconomic;
    double averageScoreInForeignLanguage;

    double srednuaya(double ec, double math, double lang){
        double resultSredney =  (averageScoreInEconomic + averageScoreInMath + averageScoreInForeignLanguage) / 3;
        return resultSredney;

    }

}


