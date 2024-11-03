public class Main {
    public static void main(String[] args) {
        Zwierze zwierze1 = new Zwierze("Pies", 50, true);
        Zwierze zwierze2 = new Zwierze("Słoń", 1200);
        Zwierze zwierze3 = new Zwierze("Kot", 4.5, true);

        System.out.println(zwierze1.toString());
        System.out.println(zwierze2.toString());
        System.out.println(zwierze3.toString());

        zwierze1.czyMaNadwage();
        zwierze2.czyMaNadwage();
        zwierze3.czyMaNadwage();

        Zwierze[] zwierzeta = { zwierze1, zwierze2, zwierze3 };

        double sumaWag = 0;
        for (Zwierze zwierze : zwierzeta) {
            sumaWag += zwierze.waga;
        }
        double sredniaWaga = sumaWag / zwierzeta.length;

        System.out.println("Średnia waga zwierząt: " + sredniaWaga);
    }
}
