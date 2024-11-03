public class Main {
    public static void main(String[] args) {
        printNameWithWhile();
        printNameWithFor();
        printNumbersFrom0ToNWithWhile(10);
        printNumbersFrom0ToNWithFor(10);
        printNumbersFromAToBWithWhile(3, 7);
        printNumbersFromAToBWithFor(3, 7);
        int sum1 = sumFrom0ToN(10);
        System.out.println("Suma od 0 до 10: " + sum1);
        int sum2 = sumFromAToB(3, 7);
        System.out.println("Suma от 3 до 7: " + sum2);
        printCumulativeSums(3, 5);

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Pierwszy element: " + getFirstElement(numbers));
        System.out.println("Ostatni element: " + getLastElement(numbers));
        System.out.println("Suma pierwszego i ostatniego: " + sumFirstAndLast(numbers));
        System.out.println("Długość tablicy: " + getLength(numbers));
        printArray(numbers);
    }

    // Zadanie 1
    static void printNameWithWhile() {
        int i = 0;
        while (i < 10) {
            System.out.println("Twoje imię");
            i++;
        }
    }

    // Zadanie 2
    static void printNameWithFor() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Twoje imię");
        }
    }

    // Zadanie 3
    static void printNumbersFrom0ToNWithWhile(int n) {
        int i = 0;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }

    // Zadanie 4
    static void printNumbersFrom0ToNWithFor(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }

    // Zadanie 5
    static void printNumbersFromAToBWithWhile(int a, int b) {
        int i = a;
        while (i <= b) {
            System.out.println(i);
            i++;
        }
    }

    // Zadanie 6
    static void printNumbersFromAToBWithFor(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    // Zadanie 7
    static int sumFrom0ToN(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Zadanie 8
    static int sumFromAToB(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    // Zadanie 9
    static void printCumulativeSums(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    // Zadanie 10
    static int getFirstElement(int[] array) {
        if (array.length == 0) {
            System.out.println("Tablica jest pusta");
            return 0;
        }
        return array[0];
    }

    // Zadanie 11
    static int getLastElement(int[] array) {
        if (array.length == 0) {
            System.out.println("Tablica jest pusta");
            return 0;
        }
        return array[array.length - 1];
    }

    // Zadanie 12
    static int sumFirstAndLast(int[] array) {
        return getFirstElement(array) + getLastElement(array);
    }

    // Zadanie 13
    static int getLength(int[] array) {
        return array.length;
    }

    // Zadanie 14
    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}