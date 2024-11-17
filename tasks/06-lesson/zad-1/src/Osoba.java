abstract class Osoba {
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public abstract int obliczRocznaWyplate();

    @Override
    public String toString() {
        return imie + " " + nazwisko + " " + rokUrodzenia;
    }
}

