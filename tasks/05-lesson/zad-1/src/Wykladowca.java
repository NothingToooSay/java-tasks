public class Wykladowca extends Czlowiek {
    public enum Stanowisko { ASYSTENT, ADIUNKT, PROFESOR }
    public enum Wyksztalcenie { MAGISTER, DOKTOR, DOKTORHAB, PROFESOR }

    public Stanowisko stanowisko;
    public Wyksztalcenie wyksztalcenie;
    public int rokZatrudnienia;

    public Wykladowca(int rokUrodzenia, String imie, String nazwisko, String pesel, Stanowisko stanowisko, Wyksztalcenie wyksztalcenie, int rokZatrudnienia) {
        super(rokUrodzenia, imie, nazwisko, pesel);
        this.stanowisko = stanowisko;
        this.wyksztalcenie = wyksztalcenie;
        this.rokZatrudnienia = rokZatrudnienia;
    }

    @Override
    public String toString() {
        return super.toString() + " " + stanowisko + " " + wyksztalcenie + " " + rokZatrudnienia;
    }
}
