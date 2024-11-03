public class Zwierze {
    public String imie;
    public double waga;
    public boolean czyUdomowione;

    public Zwierze(String imie, double waga, boolean czyUdomowione) {
        this.imie = imie;
        this.waga = waga;
        this.czyUdomowione = czyUdomowione;
    }

    public Zwierze(String imie, double waga) {
        this(imie, waga, false);
    }

    @Override
    public String toString() {
        return "Imię: " + imie + ", waga: " + waga + ", czy udomowione: " + czyUdomowione;
    }

    public void czyMaNadwage() {
        if (waga > 100) {
            System.out.println(imie + " ma nadwagę.");
        } else {
            System.out.println(imie + " nie ma nadwagi.");
        }
    }
}