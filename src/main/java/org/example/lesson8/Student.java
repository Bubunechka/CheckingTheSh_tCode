package org.example.lesson8;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name, int course) {
        count++;
        this.name = name;
        this.course = course;
        System.out.println("Student # " + count + " sozdan");
    }

    public static void showCount(){
        System.out.println("Vsego sozdano student-ov: " + count);
    }

    public void showInfo(){
        System.out.println("Welcome to the student class");
    }

    void abc(){  // в нестатичном методе можем вызывать нестатичную переменную
        a++;     // Если мы используем данный метод, значит объект, который может его использовать, уже создан
                 // если метод абс спользовался, значит объект уже создан
        count++;
    }

    static void abcd(){ // Может запускаться без дополнительно созданных объектов
        count++;
        //a++; - Переменную а внутри статичного метода мы использовать не можем, она не является static и не принадлежит
        // всему классу, а принадлежит каджому объекту(у которого есть своя переменная а). Чтобы ее использовать,
        // нужно иметь созданный объект
        // НО! Если мы создадим объект внутри этого метода, и будем увеличивать а через объект - компилятор ругаться не будет
        // потому что есть объект, которому принадлежит а
        Student st2 = new Student("Petr", 4);  //TODO НЕТ ОБЪЕКТА - НЕТ INSTANCE ПЕРЕМЕННОЙ
        st2.a++;

    }

}

class StudentTest {

        public static void main(String[] args) {
            Student.abcd(); // без созданного объекта ок
            Student st2 = new Student("Dionis", 2);
            st2.abc(); // без созданного объекта не ок

//            Student st1 = new Student("David", 1);
//            Student st2 = new Student("Dionis", 2);
//            Student st3 = new Student("Dimon", 3);
//
//            System.out.println(Student.count); // смотрим, сколько всего создано
//
//            Student.showCount(); // можем вызывать метод, не создавая объект
//            // импортировала, потому что ругался компилятор, потому что метод в другом классе
//            // потому что то, что пишет препод в нетбинс не работает так же в интелидже
//
//            st2.showCount();

        }
    }


