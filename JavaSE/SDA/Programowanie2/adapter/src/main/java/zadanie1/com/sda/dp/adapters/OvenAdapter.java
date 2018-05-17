package zadanie1.com.sda.dp.adapters;

import zadanie1.com.sda.dp.KitchenDevice;
import zadanie1.com.sda.dp.devices.Oven;

public class OvenAdapter implements KitchenDevice {
    private Oven oven;

    public OvenAdapter(Oven oven) {
        this.oven = oven;
    }

    public void turnDeviceOn() {
        oven.turnOn();
    }

    public void turnDeviceOff() {
        oven.turnOff();
    }
}
