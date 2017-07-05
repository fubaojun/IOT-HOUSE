package com.fuzi.bj.iothouse.action.device.common;

import com.fuzi.bj.iothouse.command.device.common.EspCommandDeviceSleepRebootLocal;
import com.fuzi.bj.iothouse.command.device.common.IEspCommandDeviceSleepRebootLocal;
import com.fuzi.bj.iothouse.type.device.EspDeviceType;

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
