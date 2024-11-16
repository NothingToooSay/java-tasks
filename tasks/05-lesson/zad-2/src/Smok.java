class Smok extends Postac {
    private String kolor;

    public Smok(String nazwa, int punktyZycia, int punktyMany, int punkтыAtaku, String kolor) {
        super(nazwa, punktyZycia, punktyMany, punkтыAtaku);
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return super.toString() + ", kolor='" + kolor + '\'';
    }
}