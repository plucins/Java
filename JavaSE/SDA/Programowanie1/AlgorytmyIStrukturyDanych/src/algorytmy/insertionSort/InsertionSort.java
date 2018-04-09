package algorytmy.insertionSort;

public class InsertionSort {

    public static void sort(int[] tab){
        for(int i = 1; i < tab.length; i++){
            int klucz = tab[i];
            int j = i - 1;

            while (j >= 0 && tab[j] > klucz){
                tab[j + 1] = tab[j];
                j--;
                tab[j+1] = klucz;
            }

        }
    }
}

