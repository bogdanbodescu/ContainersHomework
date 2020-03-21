package ro.siit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ex2Tests {
    @Test
    public void listTests(){
        //inits
        //persons
        Persoana p1 = new Student("Gabi",33);
        Persoana p2 = new Angajat("Dorel",55);
        Persoana p3 = new Somer("Andrei", 22);
        Persoana p4 = new Student("Diana", 21);
        Persoana p5 = new Angajat("Doriana", 38);
        Persoana p6 = new Somer ("Adrian", 66);

        //Addresses
        Adresa a1 = new Adresa("Str 1", "China");
        Adresa a2 = new Adresa("Str 2", "Japonia");
        Adresa a3 = new Adresa("Str 3", "Romania");
        Adresa a4 = new Adresa("Str 4", "Franta");
        Adresa a5 = new Adresa("Str 5", "Italia");
        Adresa a6 = new Adresa("Str 6", "Spania");
        Adresa a7 = new Adresa("Str 7", "Germania");

        //Lists of Addresses

        ArrayList<Adresa> al1 = new ArrayList<>();
        ArrayList<Adresa> al2 = new ArrayList<>();
        ArrayList<Adresa> al3 = new ArrayList<>();
        ArrayList<Adresa> al4 = new ArrayList<>();

        al1.add(a1);
        al1.add(a5);

        al2.add(a2);
        al2.add(a6);
        al2.add(a1);

        al3.add(a7);

        al4.add(a3);
        al4.add(a4);

        //hobbies
        Hobby h1 = new Hobby("clicsm", 5, al1 );
        Hobby h2 = new Hobby("teatru", 2, al2);
        Hobby h3 = new Hobby("drumetie", 1, al3);
        Hobby h4 = new Hobby("fotbal", 3, al4);

        List<Hobby> hl1 = new ArrayList<>();
        List<Hobby> hl2 = new ArrayList<>();
        List<Hobby> hl3 = new ArrayList<>();
        List<Hobby> hl4 = new ArrayList<>();

        hl1.add(h1);
        hl1.add(h2);
        hl1.add(h3);

        hl2.add(h2);
        hl2.add(h1);

        hl3.add(h3);

        hl4.add(h1);
        hl4.add(h4);
        hl4.add(h2);


        //addition.

        HashMap <Persoana,List<Hobby>> hmph = new HashMap<>();
        hmph.put(p1,hl1);
        hmph.put(p5,hl2);
        hmph.put(p6,hl3);
        hmph.put(p2,hl1);
        hmph.put(p4,hl3);
        hmph.put(p3,hl4);

        System.out.println(hmph);

    }
}
