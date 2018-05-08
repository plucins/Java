package zadanie1.main;

import zadanie1.Computer.AbstractPC;
import zadanie1.Computer.ComputerFactory;

public class Main {
    public static void main(String[] args) {
        AbstractPC asusZenBook = ComputerFactory.creatAsusZenBook();
        AbstractPC hpPavilion = ComputerFactory.createHpPavilion();
        AbstractPC samsungNotebok = ComputerFactory.createSamsungNotebook();

    }
}
