enum Dzien {
    PONIEDZIALEK, WTOREK, SRODA, CZWARTEK, PIATEK
}

public class Sala {
    public int numer;
    public Dzien dzien;
    public BlokZajeciowy[] blokiZajeciowe;

    public Sala(int numer, Dzien dzien) {
        this.numer = numer;
        this.dzien = dzien;
        this.blokiZajeciowe = new BlokZajeciowy[8];
    }

    public boolean DodajZajecieDoSali(BlokZajeciowy blokZajeciowy, int numerBloku) {
        if (blokiZajeciowe[numerBloku] == null) {
            blokiZajeciowe[numerBloku] = blokZajeciowy;
            return true;
        } else {
            return false;
        }
    }

    public boolean UsunZajeciaZSali(int numerBloku) {
        if (blokiZajeciowe[numerBloku] != null) {
            blokiZajeciowe[numerBloku] = null;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sala nr: ").append(numer).append(", Dzien: ").append(dzien).append("\n");

        for (int i = 0; i < blokiZajeciowe.length; i++) {
            if (blokiZajeciowe[i] != null) {
                sb.append("Blok ").append(i).append(": ").append(blokiZajeciowe[i]).append("\n");
            } else {
                sb.append("Blok ").append(i).append(": wolny\n");
            }
        }
        return sb.toString();
    }
}
