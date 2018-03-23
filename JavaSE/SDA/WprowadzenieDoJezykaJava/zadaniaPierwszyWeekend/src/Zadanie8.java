public class Zadanie8 {
    public static void main(String[] args) {
        int[] tablicaDoPosotrowania = new int[]{1,6,5,2,9,7,5,2,1,5,3,4,0,4,6,2,3,6,1};
        wyswietlTablice(sortowanieRosnace(tablicaDoPosotrowania));
        System.out.println();
        wyswietlTablice(sortowanieMalejace(tablicaDoPosotrowania));

    }

    private static int[] sortowanieRosnace(int[] tablicaDoPosortowania){
        boolean zmieniony;

        do {
            zmieniony = false;
            for (int i = 0; i < tablicaDoPosortowania.length-1; i++) {
                if (tablicaDoPosortowania[i] > tablicaDoPosortowania[i + 1]) {
                    int temp = tablicaDoPosortowania[i];
                    tablicaDoPosortowania[i] = tablicaDoPosortowania[i + 1];
                    tablicaDoPosortowania[i + 1] = temp;
                    zmieniony = true;
                }
            }
        }while(zmieniony);

        return tablicaDoPosortowania;
    }

    private static int[] sortowanieMalejace(int[] tablicaDoPosortowania){
        boolean zmieniony;

        do {
            zmieniony = false;
            for (int i = 0; i < tablicaDoPosortowania.length-1; i++) {
                if (tablicaDoPosortowania[i] < tablicaDoPosortowania[i + 1]) {
                    int temp = tablicaDoPosortowania[i];
                    tablicaDoPosortowania[i] = tablicaDoPosortowania[i + 1];
                    tablicaDoPosortowania[i + 1] = temp;
                    zmieniony = true;
                }
            }
        }while(zmieniony);

        return tablicaDoPosortowania;
    }



    private static void wyswietlTablice(int[] tablicaDoWyswietlenia){
        for(int i:tablicaDoWyswietlenia){
            System.out.print(i);
        }
    }
}
