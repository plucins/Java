package pl.anicos.patterns.exercises.factorymethod;

public class Mac extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    public Mac(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public String getRAM() {
        return ram;
    }

    public String getHDD() {
        return hdd;
    }

    public String getCPU() {
        return cpu;
    }
}
