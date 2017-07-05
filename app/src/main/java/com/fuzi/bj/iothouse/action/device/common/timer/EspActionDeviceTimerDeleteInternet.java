package com.fuzi.bj.iothouse.action.device.common.timer;

import com.fuzi.bj.iothouse.command.device.common.EspCommandDeviceTimerInternet;
import com.fuzi.bj.iothouse.command.device.common.IEspCommandDeviceTimerInternet;
import com.fuzi.bj.iothouse.device.IEspDevice;

public class EspActionDeviceTimerDeleteInternet implements IEspActionDeviceTimerDeleteInternet
{
    
    @Override
    public boolean doActionDeviceTimerDeleteInternet(IEspDevice device, long timerId)
    {
        IEspCommandDeviceTimerInternet command = new EspCommandDeviceTimerInternet(device);
        return command.doCommandDeviceTimerDelete(timerId);
    }
    
}
