package dziedziczenie;

public class Student extends Osoba {

    private long nrIndeksu;

    public Student(String imie, String nazwisko, int wiek, long nrIndeksu) {
        super(imie, nazwisko, wiek);
        this.nrIndeksu = nrIndeksu;
    }

    @Override
    public void przedstawSie() {
        System.out.println(String.format("Cześć jestem %s i studiuję prawo",imie));
    }

    @Override
    public String toString() {
        return String.format("Student %s %d lat",imie,wiek);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student that = (Student) obj;
            if(this.nrIndeksu == that.nrIndeksu){
                return true;
            }
        }
        return false;
    }
}
