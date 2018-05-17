package zadanie1.com.sda.dp;

import zadanie1.com.sda.dp.adapters.CoffeMachineAdapter;
import zadanie1.com.sda.dp.adapters.FridgeAdapter;
import zadanie1.com.sda.dp.adapters.OvenAdapter;
import zadanie1.com.sda.dp.devices.CoffeMachine;
import zadanie1.com.sda.dp.devices.Fridge;
import zadanie1.com.sda.dp.devices.Oven;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    private List<KitchenDevice> deviceList;

    public Kitchen() {
        this.deviceList = new ArrayList<>();
        this.deviceList.add(new OvenAdapter(new Oven()));
        this.deviceList.add(new CoffeMachineAdapter(new CoffeMachine()));
        this.deviceList.add(new FridgeAdapter(new Fridge()));
    }

    public void turnEverythingOn(){
        for (KitchenDevice device : deviceList) {
            device.turnDeviceOn();
        }
    }

    public void turnEverythingOff(){
        for (KitchenDevice device : deviceList) {
            device.turnDeviceOff();
        }
    }
}
