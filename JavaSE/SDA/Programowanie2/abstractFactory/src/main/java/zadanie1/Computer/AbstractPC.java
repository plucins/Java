package zadanie1.Computer;

public abstract class AbstractPC {
    private String tekst;
    private COMPUTER_BRAND computerBrand;
    private int cpu_power;
    private double gpu_power;
    private boolean isOverclocked;

    public AbstractPC(String tekst, COMPUTER_BRAND computerBrand, int cpu_power, double gpu_power, boolean isOverclocked) {
        this.tekst = tekst;
        this.computerBrand = computerBrand;
        this.cpu_power = cpu_power;
        this.gpu_power = gpu_power;
        this.isOverclocked = isOverclocked;
    }
}
