package ro.siit;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class Ex1Tests {

    @Test
    public void testTreesets() {
        Set<Persoana> persoane = new TreeSet<Persoana>(new PersoanaNumeComparator().thenComparing(new PersoanaAgeComparator()));
        persoane.add(new Persoana("Adrian", 5));
        persoane.add(new Persoana("Adrian", 10));
        persoane.add(new Persoana("Adrian", 51));
        persoane.add(new Persoana("Adrian", 15));
        persoane.add(new Persoana("Adrian", 12));
        persoane.add(new Persoana("Adrian", 100));
        persoane.add(new Persoana("Cristi", 100));
        persoane.add(new Persoana("Cristi", 10));
        persoane.add(new Persoana("Cristi", 14));
        persoane.add(new Persoana("Cristi", 35));
        persoane.add(new Persoana("Cristi", 2));
        persoane.add(new Persoana("Adrian", 10));
        persoane.add(new Persoana("Marcela", 10));
        persoane.add(new Persoana("Maricica", 100));
        persoane.add(new Persoana("Andrei", 10));
        persoane.add(new Persoana("Zfkdsa", 10));
        persoane.add(new Persoana("Aida", 100));
        persoane.add(new Persoana("Cornelia", 10));

        for (Persoana p : persoane
        ) {
            System.out.println(p);

        }
    }
}
