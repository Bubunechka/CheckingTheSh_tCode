package org.example.lesson11;

public class Student {

    public String name;
    public int course;
    public double grade;

    public Student (String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }



//    public static void swap(Student s1, Student s2){
//        Student s3 = s1;
//        s1 = s2;
//        s2 = s3;
//        System.out.println(s1.name);
//    }

    public static void chanceName(Student s1){
        s1.name = "Vasya";
    }

    public static void main(String[] args) {

        Student st1 = new Student("Rafaell", 3, 4.99);
        Student st2 = new Student("David", 2, 4.25);
//        swap(st1, st2);
//        System.out.println(st1.name);
//        System.out.println(st2.name);

        chanceName(st2);
        System.out.println(st2.name);


    }

}

