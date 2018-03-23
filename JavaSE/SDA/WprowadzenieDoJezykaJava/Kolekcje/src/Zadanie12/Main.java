package Zadanie12;

public class Main {
    public static void main(String[] args) {

        RejestrObywateli rejestrObywateli = new RejestrObywateli();
        rejestrObywateli.dodajObywatela("Jan","Jankowski","90092804282");
        rejestrObywateli.dodajObywatela("Adam","Adamowicz","71012717503");
        rejestrObywateli.dodajObywatela("Piotr","piotrowski","39091200804");
        rejestrObywateli.dodajObywatela("Dawid","Dawidowski","65121806074");
        rejestrObywateli.dodajObywatela("Aneta","Antczak","71081219331");
        rejestrObywateli.dodajObywatela("Mirek","Marczak","12241908201");
        rejestrObywateli.dodajObywatela("Iwona","Iwańska","89051501586");
        rejestrObywateli.dodajObywatela("Lena","Lenowska","14290617820");
        rejestrObywateli.dodajObywatela("Robert","Robkowski","24062513537");
        rejestrObywateli.dodajObywatela("Artur","Artczak","85022416516");

        System.out.println(rejestrObywateli.znajdzObywateliUrodzonychPrzed(1925));
        System.out.println(rejestrObywateli.znajdźObywatelaPoNazwisku("Artczak"));
        System.out.println(rejestrObywateli.znajdźObywateliZRokuZImieniem(1971,"Aneta"));
        System.out.println(rejestrObywateli.znajdźObywatelaPoPeselu("65121806074"));



    }
}
