public class Main {
    public static void main(String[] args) {
        try {
            Pracownik[] pracownicy = new Pracownik[4];
            pracownicy[0] = new Pracownik("Jan", "Kowalski", 1980, "12345678901", 5000, 10, 30);
            pracownicy[1] = new Pracownik("Anna", "Nowak", 1985, "10987654321", 4500, 5, 28);
            pracownicy[2] = new Kierownik("Marek", "Zieliński", 1975, "56789012345", 7000, 8, 35, 3, 200);
            pracownicy[3] = new Kierownik("Jolanta", "Kwiatkowska", 1982, "54321098765", 6500, 12, 32, 2, 180);

            for (Pracownik pracownik : pracownicy) {
                System.out.println(pracownik.toString());
                System.out.println("Roczna wyplata: " + pracownik.obliczRocznaWyplate());
            }

            System.out.println("\nInformacje o kierownikach:");
            for (Pracownik pracownik : pracownicy) {
                if (pracownik instanceof Kierownik) {
                    System.out.println(pracownik.toString());
                }
            }

        } catch (PracownikException e) {
            System.out.println(e.getMessage());
        }
    }
}