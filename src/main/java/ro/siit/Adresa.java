package ro.siit;

public class Adresa {
    private String strada;
    private String tara;

    public Adresa(String strada, String tara) {
        this.strada = strada;
        this.tara = tara;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "strada='" + strada + '\'' +
                ", tara='" + tara + '\'' +
                '}';
    }
}
