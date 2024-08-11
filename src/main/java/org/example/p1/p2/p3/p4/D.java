package org.example.p1.p2.p3.p4;

import org.example.p1.A;
import org.example.p1.p2.B;
import org.example.p1.p2.p3.C;
import org.example.p1.p2.p3.p4.p5.E;

import javax.sound.midi.Soundbank;

public class D {

    public static void main(String[] args) {

        A a = new A();
        a.info();
        System.out.println(" ");

        System.out.println("Вторые животные: ");
        System.out.println(B.animal);
        B.informAboutPopki();
        System.out.println(" ");

        C.infoCat("Mosyaa", "мадам", 8, "exotic");

        System.out.println(" ");
        System.out.println("А есть Колян :D ");
        System.out.println();
        System.out.println("Ему " + E.age);

        E e = new E();
        e.infoKolyan();


    }

}
