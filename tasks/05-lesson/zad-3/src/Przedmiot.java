class Przedmiot {
    private String nazwa;
    private int wartosc;

    public Przedmiot(String nazwa, int wartosc) {
        this.nazwa = nazwa;
        this.wartosc = wartosc;
    }

    @Override
    public String toString() {
        return "Przedmiot{" +
                "nazwa='" + nazwa + '\'' +
                ", wartosc=" + wartosc +
                '}';
    }
}