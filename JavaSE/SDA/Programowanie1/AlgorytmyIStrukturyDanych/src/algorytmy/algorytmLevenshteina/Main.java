package algorytmy.algorytmLevenshteina;

public class Main {
    public static void main(String[] args) {
        LevenshteinAlgorithmTable c = new LevenshteinAlgorithmTable();

        int[][] tab = c.initTable("foka","kotka");


        c.fillTable(tab);
        c.printTable(tab);
    }
}
