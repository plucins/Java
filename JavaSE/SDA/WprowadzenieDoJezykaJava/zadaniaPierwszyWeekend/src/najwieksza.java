public class najwieksza {
    public static void main(String[] args) {
        int[] tab = new int[]{2, 5, 1, -3, 5, 22, 21, 66, 21, 54};


        int min = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) {

                min = tab[i];

            }
        }
        System.out.println("Najmniejsza liczba to:" + min);

        int max = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {

                max = tab[i];
            }
        }
        System.out.println("Największa to " + max);
    }
}
