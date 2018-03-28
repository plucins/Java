package algorytmy.algorytmLevenshteina;

public class LevenshteinAlgorithmTable {

    private String wyraz1;
    private String wyraz2;

    public String getWyraz1() {
        return wyraz1;
    }

    public void setWyraz1(String wyraz1) {
        this.wyraz1 = wyraz1;
    }

    public String getWyraz2() {
        return wyraz2;
    }

    public void setWyraz2(String wyraz2) {
        this.wyraz2 = wyraz2;
    }


    public int[][] initTable(String wyraz1, String wyraz2) {
        setWyraz1(wyraz1);
        setWyraz2(wyraz2);
        int[][] table = new int[getWyraz1().length() + 1][getWyraz2().length() + 1];

        for (int i = 0; i < getWyraz2().length() + 1; i++) {
            table[0][i] = i;
        }

        for (int j = 0; j < getWyraz1().length() + 1; j++) {
            table[j][0] = j;
        }
        return table;
    }

    public void fillTable(int[][] tab) {
        for (int i = 0; i < getWyraz1().length(); i++) {
            for (int j = 0; j < getWyraz2().length(); j++) {
                int liczbaNaGorze = 0;
                int liczbaObok = 0;
                int liczbaPoUkosie = 0;
                int koszt = 0;
                if (getWyraz1().charAt(i) != getWyraz2().charAt(j)) koszt = 1;
                liczbaNaGorze = tab[i + 1][j] + 1;
                liczbaObok = tab[i][j + 1] + 1;
                liczbaPoUkosie = tab[i][j] + koszt;

                tab[i + 1][j + 1] = Math.min(liczbaNaGorze, Math.min(liczbaObok, liczbaPoUkosie));
            }
        }

    }

    public void printTable(int[][] tab) {
        for (int i = 0; i <= getWyraz1().length(); i++) {
            System.out.println();
            for (int j = 0; j <= getWyraz2().length(); j++) {
                System.out.print(tab[i][j]);
            }
        }
    }


}
