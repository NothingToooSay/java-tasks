public class Main {
    public static void main(String[] args) {
        Postac postac = new Postac("Postac", 100, 50, 20);
        postac.przywitajSie();
        System.out.println(postac);

        Ork ork = new Ork("Ork", 150, 30, 40, Ork.TypOrka.BOJOWY);
        ork.przywitajSie();
        System.out.println(ork);

        Smok smok = new Smok("Smok", 200, 100, 50, "Gold");

        System.out.println(smok);
    }
}
