package com.iothouse.framework.action.device.common.timer;

import com.iothouse.framework.command.device.common.EspCommandDeviceTimerInternet;
import com.iothouse.framework.command.device.common.IEspCommandDeviceTimerInternet;
import com.iothouse.framework.device.IEspDevice;

public class EspActionDeviceTimerGetInternet implements IEspActionDeviceTimerGetInternet
{
    
    @Override
    public boolean doActionDeviceTimerGet(IEspDevice device)
    {
        IEspCommandDeviceTimerInternet command = new EspCommandDeviceTimerInternet(device);
        return command.doCommandDeviceTimerGet();
    }
    
}
