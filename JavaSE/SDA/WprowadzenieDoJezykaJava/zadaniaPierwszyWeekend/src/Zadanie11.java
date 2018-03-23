public class Zadanie11 {
    public static void main(String[] args) {
        int[] tablica1 = new int[]{5,4,6,7,2,1,23,11,13};
        int[] tablica2 = new int[]{7,6,5,4,3,2,1,9,8,7,10,11};

        for(int i: usunZera(czescWspolna(tablica1,tablica2))){
            System.out.print(i+" ");
        }
    }

    private static int[] czescWspolna(int[] tablica1, int[] tablica2){
        int[] elementyWspolne = new int[99];
        for(int i = 0; i < tablica1.length;i++){
            for(int j =0; j < tablica2.length;j++){
                if(tablica1[i] == tablica2[j]){
                    elementyWspolne[i] = tablica1[i];
                }
            }
        }
        return elementyWspolne;
    }

    private static int[] usunZera(int[] tablica){
        int licznik=-1;
        for( int i: tablica){
            if( i > 0){
                licznik++;
            }
        }

        int[] tablicaBezZer = new int[licznik+1];
        for(int i = 0; i < tablica.length;i++){
            if(tablica[i] > 0){
                tablicaBezZer[licznik--] = tablica[i];
            }
        }
        return  tablicaBezZer;
    }
}
