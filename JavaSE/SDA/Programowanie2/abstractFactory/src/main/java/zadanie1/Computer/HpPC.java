package zadanie1.Computer;

class HpPC extends AbstractPC {

    public HpPC(String tekst, int cpu_power, double gpu_power, boolean isOverclocked) {
        super(tekst, COMPUTER_BRAND.HP, cpu_power, gpu_power, isOverclocked);
    }


}
