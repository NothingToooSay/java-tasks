class Pokarm extends Przedmiot {
    private int punktyOdnowyZycia;

    public Pokarm(String nazwa, int wartosc, int punktyOdnowyZycia) {
        super(nazwa, wartosc);
        this.punktyOdnowyZycia = punktyOdnowyZycia;
    }
}