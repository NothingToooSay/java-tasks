public class Main {
    public static void main(String[] args) {
        try {
            int[] liczby = {10, 20, 0, 40, 50};
            MojeLiczby mojeLiczby = new MojeLiczby(liczby);

            System.out.println("Pobieranie elementu z indeksu 1: " + mojeLiczby.pobierzElement(1));
            System.out.println("Pobieranie elementu z indeksu 10: " + mojeLiczby.pobierzElement(10));

            System.out.println("Dzielenie elementu z indeksu 1 przez indeks 2: " + mojeLiczby.podzielElementy(1, 2));
            System.out.println("Dzielenie elementu z indeksu 3 przez indeks 10: " + mojeLiczby.podzielElementy(3, 10));
            System.out.println("Dzielenie elementu z indeksu 2 przez indeks 0: " + mojeLiczby.podzielElementy(2, 0));

        } catch (MojeLiczbyException e) {
            System.out.println(e.getMessage());
        }
    }
}