package zadanie1.com.sda.dp.adapters;

import zadanie1.com.sda.dp.KitchenDevice;
import zadanie1.com.sda.dp.devices.Fridge;

public class FridgeAdapter implements KitchenDevice {
    private Fridge fridge;

    public FridgeAdapter(Fridge fridge) {
        this.fridge = fridge;
    }

    public void turnDeviceOn() {
        fridge.switchOn();
    }

    public void turnDeviceOff() {
        fridge.switchOff();
    }
}
