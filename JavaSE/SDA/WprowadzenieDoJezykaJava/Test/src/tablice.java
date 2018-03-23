public class tablice {
    public static void main(String[] args) {
        int[] liczby = new int[]{1,3,5,10,12,15,16,19,21,3,4,16,7,2};

        for(int i: liczby){
            if(i%2 == 0)
            System.out.println(i);
        }

        System.out.println("Liczby o parzystyn indeksie");
        for(int i= 0; i<liczby.length;i++){
            if(i%2 == 0){
                System.out.println(liczby[i]);
            }
        }

        System.out.println("liczby w odwrotnej kolejnosci");
        for(int i = liczby.length; i > 0; i--){
            System.out.println(liczby[i-1]);
        }



    }

}
