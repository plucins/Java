package algorytmy.couintingSort;

public class CouintingSort {

    public static void sort(int[] tab){
        int[] iloscLicz = new int[256];

        for(int i = 0; i < tab.length;i++) {
            int tabWartosc = tab[i];
            iloscLicz[tabWartosc]++;
        }

        int pozycja = 0;
        for(int j = 0; j < iloscLicz.length;j++){
            for(int i = 0; i < iloscLicz[j];i++){
                tab[pozycja] = j;
                pozycja++;
            }
        }

    }
}
