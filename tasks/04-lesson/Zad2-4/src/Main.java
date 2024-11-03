import java.util.Scanner;

public class
Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wybor;

        while (true) {
            System.out.println("Podaj imię studenta: ");
            String imie = scanner.nextLine();
            if (imie.equalsIgnoreCase("KONIEC")) {
                break;
            }

            System.out.println("Podaj nazwisko studenta: ");
            String nazwisko = scanner.nextLine();

            System.out.println("Podaj numer albumu studenta: ");
            String numerAlbumu = scanner.nextLine();

            Student student = new Student(imie, nazwisko, numerAlbumu);

            System.out.println("Wybierz grę (F - Fortnite, C - Counter Strike): ");
            wybor = scanner.nextLine().toUpperCase();

            if (wybor.equals("F")) {
                student.zaglosujZaGreFortnite();
                System.out.println("Student zagłosował na Fortnite.");
            } else if (wybor.equals("C")) {
                student.zaglosujZaGreCounterStrike();
                System.out.println("Student zagłosował na Counter Strike.");
            } else {
                System.out.println("Nieprawidłowy wybór gry.");
            }
        }

        System.out.println("\nPodsumowanie głosowania:");
        System.out.println("Liczba głosów na Fortnite: " + GlosZaGreFortnite.zwrocIloscGlosow());
        System.out.println("Liczba głosów na Counter Strike: " + GlosZaGreCounterStrike.zwrocIloscGlosow());
    }
}
