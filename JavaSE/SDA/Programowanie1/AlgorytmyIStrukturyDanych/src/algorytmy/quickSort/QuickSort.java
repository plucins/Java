package algorytmy.quickSort;

public class QuickSort {

    public static void sort(int[] tablica){
        quick(tablica, 0, tablica.length - 1);
    }

    private static void quick(int[] tablica, int from, int to){

        int pivot = tablica[(from + to) / 2];

        int lewy = from;
        int prawy = to;

        do {
            while (tablica[lewy] < pivot) {
                lewy++;
            }

            while (tablica[prawy] > pivot) {
                prawy--;
            }

            if (lewy <= prawy) {
                int tymczasowy = tablica[lewy];
                tablica[lewy] = tablica[prawy];
                tablica[prawy] = tymczasowy;
                lewy++;
                prawy--;
            }
        }while(lewy <= prawy);

        if(prawy > from){
            quick(tablica,from,prawy);
        }

        if(lewy < to){
            quick(tablica,lewy,to);
        }
    }
}
