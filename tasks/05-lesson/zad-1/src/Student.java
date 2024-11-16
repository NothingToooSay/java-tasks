public class Student extends Czlowiek {
    public int numerIndeksu;
    public int rokRozpoczeciaStudiow;
    public int rokStudiow;

    public Student(int rokUrodzenia, String imie, String nazwisko, String pesel, int numerIndeksu, int rokRozpoczeciaStudiow, int rokStudiow) {
        super(rokUrodzenia, imie, nazwisko, pesel);
        this.numerIndeksu = numerIndeksu;
        this.rokRozpoczeciaStudiow = rokRozpoczeciaStudiow;
        this.rokStudiow = rokStudiow;
    }

    @Override
    public String toString() {
        return super.toString() + " " + numerIndeksu;
    }
}
