package zadanie1.Computer;

public class SamsungPC extends AbstractPC {

    public SamsungPC(String tekst, int cpu_power, double gpu_power, boolean isOverclocked) {
        super(tekst, COMPUTER_BRAND.SAMSUNG, cpu_power, gpu_power, isOverclocked);
    }
}
