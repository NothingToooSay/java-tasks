class Ork extends Postac {
    enum TypOrka {
        BOJOWY, KUCHARZ, GARNCARZ
    }

    private TypOrka typOrka;

    public Ork(String nazwa, int punktyZycia, int punktyMany, int punktyAtaku, TypOrka typOrka) {
        super(nazwa, punktyZycia, punktyMany, punktyAtaku);
        this.typOrka = typOrka;
    }

    @Override
    public String toString() {
        return super.toString() + ", typOrka=" + typOrka;
    }
}