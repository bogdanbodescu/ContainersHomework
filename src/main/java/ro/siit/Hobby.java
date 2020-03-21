package ro.siit;

import java.util.ArrayList;
import java.util.Objects;

public class Hobby {
    private String name;
    private int frequency;
    private ArrayList<Adresa> adList;

    public Hobby(String name, int frequency, ArrayList<Adresa> adList) {
        this.name = name;
        this.frequency = frequency;
        this.adList = adList;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", adList=" + adList +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hobby hobby = (Hobby) o;
        return frequency == hobby.frequency &&
                Objects.equals(name, hobby.name) &&
                Objects.equals(adList, hobby.adList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, frequency, adList);
    }
}
