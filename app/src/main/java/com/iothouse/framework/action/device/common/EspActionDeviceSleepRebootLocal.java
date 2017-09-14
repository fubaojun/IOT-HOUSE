package com.iothouse.framework.action.device.common;

import com.iothouse.framework.command.device.common.EspCommandDeviceSleepRebootLocal;
import com.iothouse.framework.command.device.common.IEspCommandDeviceSleepRebootLocal;
import com.iothouse.framework.type.device.EspDeviceType;

public class EspActionDeviceSleepRebootLocal implements IEspActionDeviceSleepRebootLocal
{
    
    @Override
    public void doActionDeviceSleepRebootLocal(EspDeviceType type)
    {
        IEspCommandDeviceSleepRebootLocal command = new EspCommandDeviceSleepRebootLocal();
        switch(type) {
            case FLAMMABLE:
            case HUMITURE:
            case VOLTAGE:
                command.doCommandDeviceSleepLocal();
                break;
            case LIGHT:
            case PLUG:
            case REMOTE:
            case PLUGS:
                command.doCommandDeviceRebootLocal();
                break;
            case NEW:
            case ROOT:
                break;
        }
    }
    
}
