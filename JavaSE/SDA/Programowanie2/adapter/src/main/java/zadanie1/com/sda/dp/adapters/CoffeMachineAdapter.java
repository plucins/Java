package zadanie1.com.sda.dp.adapters;

import zadanie1.com.sda.dp.KitchenDevice;
import zadanie1.com.sda.dp.devices.CoffeMachine;

public class CoffeMachineAdapter implements KitchenDevice {
    private CoffeMachine coffeMachine;

    public CoffeMachineAdapter(CoffeMachine coffeMachine) {
        this.coffeMachine = coffeMachine;
    }

    public void turnDeviceOn() {
        coffeMachine.on();
    }

    public void turnDeviceOff() {
        coffeMachine.off();
    }

}
