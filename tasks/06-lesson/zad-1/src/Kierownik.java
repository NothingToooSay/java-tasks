class Kierownik extends Pracownik {
    public int podwladni;
    public int dodatekZaPodwladnego;

    public Kierownik(String imie, String nazwisko, int rokUrodzenia, String PESEL, int pensja, int liczbaNadgodzin, int kwotaZaNadgodzine, int podwladni, int dodatekZaPodwladnego) throws PracownikException {
        super(imie, nazwisko, rokUrodzenia, PESEL, pensja, liczbaNadgodzin, kwotaZaNadgodzine);
        this.podwladni = podwladni;
        this.dodatekZaPodwladnego = dodatekZaPodwladnego;
    }

    @Override
    public int obliczRocznaWyplate() {
        return super.obliczRocznaWyplate() + podwladni * dodatekZaPodwladnego;
    }

    @Override
    public String toString() {
        return super.toString() + " Podwladni: " + podwladni + " Dodatek za podwladnego: " + dodatekZaPodwladnego;
    }
}

