public class Main {
    public static void main(String[] args) {
        Czlowiek c1 = new Czlowiek(1985, "Adam", "Nowak", "12345678901");
        Czlowiek c2 = new Czlowiek(1990, "Ewa", "Kowalska", "09876543210");

        Student s1 = new Student(2000, "Jan", "Kowalski", "11223344556", 12345, 2019, 2);
        Student s2 = new Student(1999, "Anna", "Nowak", "22334455667", 54321, 2018, 3);

        Wykladowca w1 = new Wykladowca(1975, "Piotr", "Zielinski", "33445566778", Wykladowca.Stanowisko.PROFESOR, Wykladowca.Wyksztalcenie.DOKTOR, 2005);
        Wykladowca w2 = new Wykladowca(1980, "Marta", "Wisniewska", "44556677889", Wykladowca.Stanowisko.ADIUNKT, Wykladowca.Wyksztalcenie.MAGISTER, 2010);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(w1);
        System.out.println(w2);

        System.out.println("Student's name: " + s1.imie);
        System.out.println("Wykladowca's employment year: " + w1.rokZatrudnienia);

        Czlowiek czlowiek1 = s1;
        if (czlowiek1 instanceof Student) {
            Student downcastedStudent = (Student) czlowiek1;
            System.out.println("Student's index number: " + downcastedStudent.numerIndeksu);
        }
    }
}