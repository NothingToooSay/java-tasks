class Postac {
    private String nazwa;
    private int punktyZycia;
    private int punktyMany;
    private int punktyAtaku;

    public Postac(String nazwa, int punktyZycia, int punktyMany, int punktyAtaku) {
        this.nazwa = nazwa;
        this.punktyZycia = punktyZycia;
        this.punktyMany = punktyMany;
        this.punktyAtaku = punktyAtaku;
    }

    public void przywitajSie() {
        System.out.println("Jestem " + nazwa);
    }

    @Override
    public String toString() {
        return "Postac{" +
                "nazwa='" + nazwa + '\'' +
                ", punktyZycia=" + punktyZycia +
                ", punktyMany=" + punktyMany +
                ", punktyAtaku=" + punktyAtaku +
                '}';
    }
}