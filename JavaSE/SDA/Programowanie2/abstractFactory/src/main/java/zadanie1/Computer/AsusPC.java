package zadanie1.Computer;

class AsusPC extends AbstractPC {

    public AsusPC(String tekst, int cpu_power, double gpu_power, boolean isOverclocked) {
        super(tekst, COMPUTER_BRAND.ASUS, cpu_power, gpu_power, isOverclocked);
    }
}
