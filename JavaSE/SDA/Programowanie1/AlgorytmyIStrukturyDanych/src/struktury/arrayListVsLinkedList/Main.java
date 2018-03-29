package struktury.arrayListVsLinkedList;

public class Main {
    public static void main(String[] args) {
        ArraysGenerator a = new ArraysGenerator();

        System.out.println("Czas na poczatku Linked " + a.addAtStartleLinked());
        System.out.println("Czas na poczatku Array " + a.addAtStartArray());

        System.out.println("Dodawanie w środku Array " + a.addInTheMiddleArray());
        System.out.println("Dodawanie w środku Linked " + a.addInTheMiddleLinked());

        System.out.println("Dodawanie na koncu Array " + a.addAtEndArray());
        System.out.println("Dodawanie na koncu Linked " + a.addAtEndLinked());

        System.out.println("Usuwanie Array " + a.removeArray());
        System.out.println("Usuwanie Linked " + a.removeLinked());

        System.out.println("Pobieranie Array " + a.getArray());
        System.out.println("Pobieranie Linked " + a.getLinked());
    }
}
