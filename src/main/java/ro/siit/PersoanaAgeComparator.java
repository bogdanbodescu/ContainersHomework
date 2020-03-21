package ro.siit;

import java.util.Comparator;

public class PersoanaAgeComparator implements Comparator<Persoana> {
    @Override
    public int compare(Persoana persoana, Persoana t1) {
        return Integer.compare(persoana.getAge(),t1.getAge());
    }
}
