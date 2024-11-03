public class Student {
    public String imie;
    public String nazwisko;
    public String numerAlbumu;

    private GlosZaGreFortnite fortnite;
    private GlosZaGreCounterStrike counterstrike;

    public Student(String imie, String nazwisko, String numerAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerAlbumu = numerAlbumu;
    }

    public void zaglosujZaGreFortnite() {
        fortnite = new GlosZaGreFortnite();
    }

    public void zaglosujZaGreCounterStrike() {
        counterstrike = new GlosZaGreCounterStrike();
    }
}
