public class GraKomputerowa {
    private String nazwa;
    private String wydawca;
    private int ocena;
    private int rokWydania;
    private int liczbaGraczy;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getWydawca() {
        return wydawca;
    }

    public void setWydawca(String wydawca) {
        this.wydawca = wydawca;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public int getLiczbaGraczy() {
        return liczbaGraczy;
    }

    public void setLiczbaGraczy(int liczbaGraczy) {
        this.liczbaGraczy = liczbaGraczy;
    }

    public GraKomputerowa(String nazwa, String wydawca, int ocena, int rokWydania, int liczbaGraczy) {
        this.nazwa = nazwa;
        this.wydawca = wydawca;
        this.ocena = ocena;
        this.rokWydania = rokWydania;
        this.liczbaGraczy = liczbaGraczy;
    }

    public GraKomputerowa(String nazwa, String wydawca) {
        this.nazwa = nazwa;
        this.wydawca = wydawca;
        this.ocena = 0;
        this.rokWydania = 2000;
        this.liczbaGraczy = 1;
    }

    public String wyswietlInformacje() {
        return "Nazwa: " + nazwa + ", Wydawca: " + wydawca + ", Ocena: " + ocena
                + ", Rok Wydania: " + rokWydania + ", Liczba Graczy: " + liczbaGraczy;
    }

    private String zwrocOcenaIRokWydania() {
        return ocena + " " + rokWydania;
    }

    public String graIKomponenty() {
        return zwrocOcenaIRokWydania() + " " + liczbaGraczy;
    }
}
