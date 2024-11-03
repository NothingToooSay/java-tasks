public class Main {
    public static void main(String[] args) {
        GraKomputerowa gra1 = new GraKomputerowa("Wiedzmin 3", "CD Projekt", 10, 2015, 1);
        GraKomputerowa gra2 = new GraKomputerowa("Cyberpunk 2077", "CD Projekt");

        System.out.println("Gra 1: " + gra1.getNazwa() + ", Wydawca: " + gra1.getWydawca());
        System.out.println("Gra 2: " + gra2.getNazwa() + ", Wydawca: " + gra2.getWydawca());

        System.out.println(gra1.wyswietlInformacje());
        System.out.println(gra2.wyswietlInformacje());

        System.out.println("Gra 1 - Komponenty: " + gra1.graIKomponenty());
        System.out.println("Gra 2 - Komponenty: " + gra2.graIKomponenty());
    }
}
