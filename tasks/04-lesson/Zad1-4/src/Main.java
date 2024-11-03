public class Main {
    public static void main(String[] args) {

        System.out.println("Wartość Pi: " + PolaIOwody.Pi);

        double promienKola = 5.0;
        System.out.println("Pole koła o promieniu " + promienKola + ": " + PolaIOwody.poleKola(promienKola));
        System.out.println("Obwód koła o promieniu " + promienKola + ": " + PolaIOwody.obwodKola(promienKola));

        double aProstokat = 4.0, bProstokat = 6.0;
        System.out.println("Pole prostokąta o bokach " + aProstokat + " i " + bProstokat + ": " + PolaIOwody.poleProstokata(aProstokat, bProstokat));
        System.out.println("Obwód prostokąta o bokach " + aProstokat + " i " + bProstokat + ": " + PolaIOwody.obwodProstokata(aProstokat, bProstokat));

        double bokTrojkata = 3.0;
        System.out.println("Pole trójkąta równobocznego o boku " + bokTrojkata + ": " + PolaIOwody.poleTrojkataRownobocznego(bokTrojkata));
        System.out.println("Obwód trójkąta równobocznego o boku " + bokTrojkata + ": " + PolaIOwody.obwodTrojkataRownobocznego(bokTrojkata));
    }
}
