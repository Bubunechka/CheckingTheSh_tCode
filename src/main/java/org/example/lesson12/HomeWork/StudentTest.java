package org.example.lesson12.HomeWork;

import org.example.lesson11.Student;
public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student("John", 3, 4.99);
        Student student2 = new Student("Jake", 2, 4.25);

        compareStudents(student1, student2);
        compareStudentsAttributes(student1, student2);
    }

    public static void compareStudents(Student student1, Student student2){
        if(student1.name.equals(student2.name)){
            System.out.println("Студенты во всем равны");
        } else{
            System.out.println("Студенты абсолютно разные");
        }
        }

    public static void compareStudentsAttributes(Student student1, Student student2){
//
//        public class StudentTest {
//            public static void main(String[] args) {
//                Student student1 = new Student("John", 3, 4.5);
//                Student student2 = new Student("Jane", 2, 3.8);
//
//                compareStudents(student1, student2);
//                compareStudentsAttributes(student1, student2);
//            }
//
//            public static void compareStudents(Student student1, Student student2) {
//                if (student1.equals(student2)) {
//                    System.out.println("Студенты равны");
//                } else {
//                    System.out.println("Студенты не равны");
//                }
//            }
//
//            public static void compareStudentsAttributes(Student student1, Student student2) {
//                if (student1.name.equals(student2.name)) {
//                    System.out.println("Имена студентов равны");
//                } else {
//                    System.out.println("Имена студентов не равны");
//                }
//
//                if (student1.course == student2.course) {
//                    System.out.println("Курсы студентов равны");
//                } else {
//                    System.out.println("Курсы студентов не равны");
//                }
//
//                if (student1.grade == student2.grade) {
//                    System.out.println("Оценки студентов равны");
//                } else {
//                    System.out.println("Оценки студентов не равны");
//                }
//            }
//        }
//        В данном решении создается класс StudentTest, в котором определены два метода: compareStudents и compareStudentsAttributes.
//                Метод compareStudents сравнивает двух студентов, используя один оператор if и логические операторы внутри него. Если студенты равны, выводится сообщение "Студенты равны", иначе выводится сообщение "Студенты не равны".
//                Метод compareStudentsAttributes сравнивает все атрибуты студента по отдельности, используя вложенные операторы if. Если атрибуты студентов равны, выводится соответствующее сообщение, иначе выводится сообщение о первом обнаруженном неравенстве.
//

    }

}

