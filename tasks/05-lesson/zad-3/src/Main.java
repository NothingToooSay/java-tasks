public class Main {
    public static void main(String[] args) {
        Przedmiot miecz = new Przedmiot("Miecz", 100);
        Pokarm jablko = new Pokarm("Jabłko", 5, 20);
        Pokarm ziola = new Pokarm("Zioła lecznicze", 15, 50);

        Bohater bohater = new Bohater();

        bohater.dodajDoEkwipunku(miecz);
        bohater.dodajDoEkwipunku(jablko);
        bohater.dodajDoEkwipunku(ziola);

        bohater.wyswietlEkwipunek();

        if (bohater.sprzedaj(0)) {
            System.out.println("Miecz sprzedany");
        }

        if (bohater.zjedzPrzedmiot(1)) {
            System.out.println("Jabłko zjedzone");
        }

        bohater.wyswietlEkwipunek();
    }
}