package algorytmy.insertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] tab = new int[]{7,4,5,6,7,8,9,66,3,1,2,3,4,5,6,1,2,55,12};

        InsertionSort.sort(tab);

        System.out.println(Arrays.toString(tab));
    }
}
