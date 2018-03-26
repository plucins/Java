package algorytmLevenshteina;

public class Main {
    public static void main(String[] args) {
        TableController c = new TableController();

        int[][] tab = c.initTable("foka","kotka");


        c.fillTable(tab);
        c.printTable(tab);
    }
}
