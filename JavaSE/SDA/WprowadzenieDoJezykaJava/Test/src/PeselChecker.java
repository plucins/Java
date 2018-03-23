public class PeselChecker {
    public static void main(String[] args) {

        System.out.println(new PeselChecker().pesel("22093003711"));
    }

    private boolean pesel(String pesel){

        int[] tablicaLibcz = new int[11];

        for(int i = 0; i < pesel.length();i++){
            tablicaLibcz[i] = pesel.charAt(i);
        }

        int iloraz = tablicaLibcz[0] * 1 + tablicaLibcz[1] * 3 + tablicaLibcz[2] * 7 +
                tablicaLibcz[3] * 9 + tablicaLibcz[4] * 1 + tablicaLibcz[5] * 3 + tablicaLibcz[6] * 7 +
                tablicaLibcz[7] * 9 + tablicaLibcz[8] * 1 + tablicaLibcz[9] * 3 + tablicaLibcz[10] * 1;


        String wynik = "" + iloraz;

        if(wynik.endsWith("0")){
            return true;
        }{
            return false;
        }


    }
}
