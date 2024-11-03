public class PolaIOwody {

    public static double Pi = 3.14;
    public static double PierwiastekZTrzech = 1.73;

    public static double poleKola(double promien) {
        return Pi * promien * promien;
    }

    public static double obwodKola(double promien) {
        return 2 * Pi * promien;
    }

    public static double poleProstokata(double a, double b) {
        return a * b;
    }

    public static double obwodProstokata(double a, double b) {
        return 2 * (a + b);
    }

    public static double poleTrojkataRownobocznego(double bok) {
        return (bok * bok * PierwiastekZTrzech) / 4;
    }

    public static double obwodTrojkataRownobocznego(double bok) {
        return 3 * bok;
    }
}