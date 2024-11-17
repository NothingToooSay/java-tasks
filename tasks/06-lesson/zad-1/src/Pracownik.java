class Pracownik extends Osoba {
    private String PESEL;
    private int pensja;
    private int liczbaNadgodzin;
    private int kwotaZaNadgodzine;

    public Pracownik(String imie, String nazwisko, int rokUrodzenia, String PESEL, int pensja, int liczbaNadgodzin, int kwotaZaNadgodzine) throws PracownikException {
        super(imie, nazwisko, rokUrodzenia);
        this.PESEL = PESEL;

        if (kwotaZaNadgodzine < WynagrodzenieMinimalne.minimalnaKwotaZaGodzine) {
            throw new PracownikException("Nie mozesz tak malo zaplacic pracownikowi za godzine pracy!");
        }

        if (pensja < WynagrodzenieMinimalne.minimalnaKwotaZaMiesiac) {
            throw new PracownikException("Nie mozesz tak malo zaplacic pracownikowi za miesiac pracy na etacie!");
        }

        this.pensja = pensja;
        this.liczbaNadgodzin = liczbaNadgodzin;
        this.kwotaZaNadgodzine = kwotaZaNadgodzine;
    }

    @Override
    public int obliczRocznaWyplate() {
        return pensja * 12 + liczbaNadgodzin * kwotaZaNadgodzine;
    }

    @Override
    public String toString() {
        return super.toString() + " " + PESEL + " " + pensja + " " + liczbaNadgodzin + " " + kwotaZaNadgodzine + " Roczna wyplata: " + obliczRocznaWyplate();
    }
}
