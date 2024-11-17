class MojeLiczby {
    private int[] liczby;

    public MojeLiczby(int[] liczby) throws MojeLiczbyException {
        if (liczby == null || liczby.length == 0) {
            throw new MojeLiczbyException("Tablica nie może być pusta.");
        }
        this.liczby = liczby;
    }

    public int pobierzElement(int indeks) {
        try {
            return liczby[indeks];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Błąd: Indeks " + indeks + " jest poza zakresem tablicy.");
            return -1;  // Możesz zwrócić wartość specjalną lub zmienić ją na wyjątek, jeśli potrzebne
        }
    }

    public int podzielElementy(int indeks1, int indeks2) {
        try {
            int liczba1 = liczby[indeks1];
            int liczba2 = liczby[indeks2];
            return liczba1 / liczba2;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Błąd: Jeden z indeksów (" + indeks1 + " lub " + indeks2 + ") jest poza zakresem tablicy.");
            return 0;  // Możesz zwrócić wartość specjalną lub zmienić ją na wyjątek, jeśli potrzebne
        } catch (ArithmeticException e) {
            System.out.println("Błąd: Próba dzielenia przez zero.");
            return 0;  // Możesz zwrócić wartość specjalną lub zmienić ją na wyjątek, jeśli potrzebne
        }
    }
}
