package obiekty;

public class SuperBohater {

    private String nazwa;
    private String supermoc;

    private SuperBohater(String nazwa, String supermoc) {
        this.nazwa = nazwa;
        this.supermoc = supermoc;
    }

    public static void main(String[] args) {
        SuperBohater bohater1 = new SuperBohater("Spiderman","pajeczyna");
        SuperBohater bohater2 = new SuperBohater("Batman" , "Batmobile");
        SuperBohater bohater3 = new SuperBohater("Adam","AdamowaMoc");

//        bohater1 = bohater2;
//        bohater1 = null;
//        System.out.println(bohater2 == null);


        bohater1 = null;
        bohater2 = bohater1;
        bohater1 = bohater3;
        System.out.println(bohater1 == null);
        System.out.println(bohater2 == null);
        System.out.println(bohater3 == null);


        String a = "Adam";
        String b = "Adam";

        String c = new String("a");
        String d = new String("a");

        System.out.println(a == b );
        System.out.println(a.equals(b));

        System.out.println(c == d);
        System.out.println(c.equals(d));


    }
}
