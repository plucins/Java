package zadanie1.com.sda.dp.adapters;

import zadanie1.com.sda.dp.KitchenDevice;
import zadanie1.com.sda.dp.devices.CoffeMachine;

public class CoffeMachineInheritedAdapter extends CoffeMachine implements KitchenDevice {

    public void turnDeviceOn() {
        super.on();
    }

    public void turnDeviceOff() {
        super.off();
    }
}
