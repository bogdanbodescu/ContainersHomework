package ro.siit;

import java.util.Comparator;

public class PersoanaNumeComparator implements Comparator<Persoana> {


    @Override
    public int compare(Persoana persoana, Persoana t1) {
        return persoana.getName().compareTo(t1.getName());
    }
}
