public class Czlowiek {
    public int rokUrodzenia;
    public String imie;
    public String nazwisko;
    public String pesel;

    public Czlowiek(int rokUrodzenia, String imie, String nazwisko, String pesel) {
        this.rokUrodzenia = rokUrodzenia;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " " + pesel;
    }
}
