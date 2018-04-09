package algorytmy.couintingSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] tab = new int[]{4,5,6,7,8,9,3,1,2,3,4,5,6,1,2};

        CouintingSort.sort(tab);

        System.out.println(Arrays.toString(tab));
    }
}
