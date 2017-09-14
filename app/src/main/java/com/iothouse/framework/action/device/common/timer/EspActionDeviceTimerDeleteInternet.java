package com.iothouse.framework.action.device.common.timer;

import com.iothouse.framework.command.device.common.EspCommandDeviceTimerInternet;
import com.iothouse.framework.command.device.common.IEspCommandDeviceTimerInternet;
import com.iothouse.framework.device.IEspDevice;

public class EspActionDeviceTimerDeleteInternet implements IEspActionDeviceTimerDeleteInternet
{
    
    @Override
    public boolean doActionDeviceTimerDeleteInternet(IEspDevice device, long timerId)
    {
        IEspCommandDeviceTimerInternet command = new EspCommandDeviceTimerInternet(device);
        return command.doCommandDeviceTimerDelete(timerId);
    }
    
}
