public class Main {
    public static void main(String[] args) {
        Student[] studenci = {
                new Student("Jan", "Kowalski", 12345),
                new Student("Anna", "Nowak", 54321),
                new Student("Piotr", "Zielinski", 67890)
        };

        Prowadzacy prowadzacy = new Prowadzacy("Dr.", "Smith", Stanowisko.ADIUNKT);

        BlokZajeciowy blok1 = new BlokZajeciowy("Matematyka", prowadzacy, studenci);

        Sala sala = new Sala(101, Dzien.PONIEDZIALEK);

        if (sala.DodajZajecieDoSali(blok1, 2)) {
            System.out.println("Zajecie dodane do bloku 2.");
        } else {
            System.out.println("Blok 2 jest zajety.");
        }

        System.out.println(sala);

        if (sala.UsunZajeciaZSali(2)) {
            System.out.println("Zajecie z bloku 2 usuniete.");
        } else {
            System.out.println("Blok 2 byl pusty.");
        }

        System.out.println(sala);
    }
}
