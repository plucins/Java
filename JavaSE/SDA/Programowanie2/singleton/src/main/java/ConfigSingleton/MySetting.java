package ConfigSingleton;

import java.util.List;

public class MySetting {

    private static final MySetting INSTANCE = new MySetting();

    private MySetting() {
        setUpFrmFle();
    }

    private int fromNumber;
    private int toNumber;
    private String action;
    private int roundCount;

    public int getFromNumber() {
        return new Game().getNumber(fromNumber);
    }

    public int getToNumber() {
        return new Game().getNumber(toNumber);
    }

    public String getActions() {
        return new Game().getAction(action);
    }

    public int getRoundCount() {
        return roundCount;
    }

    public static MySetting getInstance(){
        return INSTANCE;
    }

    private void setUpFrmFle(){
        List<String> list;
        list = new FileController().getConfigFromFile();

        for(String s : list){
            String key = s.split("=")[0];
            String value = s.split("=")[1];

            switch (key){
                case "zakres_liczby_1":
                    this.fromNumber = Integer.parseInt(value);
                    break;
                case "zakres_liczby_2":
                    this.toNumber = Integer.parseInt(value);
                    break;
                case "dostepne_dzialania":
                    this.action = value;
                    break;
                case "ilosc_rund":
                    this.roundCount = Integer.parseInt(value);
                    break;
            }
        }
    }


    public double calculate(int a, int b, String action) {
        switch (action){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
        }
        return a/b;
    }
}
