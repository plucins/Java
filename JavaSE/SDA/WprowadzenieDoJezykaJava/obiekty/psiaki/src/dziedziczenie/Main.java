package dziedziczenie;

public class Main {

    public static void main(String[] args) {
        Student jan = new Student("Jan","Kowalski",22,12345L);
        Osoba paulina = new Osoba("Paulina","Nowacka",23);
        jan.przedstawSie();
        paulina.przedstawSie();




        paulina.przedstawSie();

        System.out.println(jan);
        System.out.println(paulina);

        Student piotr = new Student("Piotr","Piotrowski",22,12345L);

        System.out.println(jan.equals(piotr));
    }
}
