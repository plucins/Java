package algorytmy.bubbleSort;

public class BubbleSort {

    public static void sort(int[] tab){
        int tabLengths = tab.length;

        do {
            for (int i = 0; i < tabLengths - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    int a = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = a;
                }
                tabLengths--;
            }
        }while(tabLengths > 1);

    }

}
