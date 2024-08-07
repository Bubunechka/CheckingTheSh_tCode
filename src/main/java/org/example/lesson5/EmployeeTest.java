package org.example.lesson5;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee em1 = new Employee(01, "Kim", 29, 35, "IT");
        Employee em2 = new Employee(02, "Park", 27, 46, "HR");
//        double zp = em1.moreMoney(2);
//        double zp2 = em2.moreMoney(3);

        em1.info();
        em2.info();

        System.out.println(em1.moreMoney());

        System.out.println(em2.moreMoney());

    }

}
