package com.fuzi.bj.iothouse.action.device.common.timer;

import com.fuzi.bj.iothouse.command.device.common.EspCommandDeviceTimerInternet;
import com.fuzi.bj.iothouse.command.device.common.IEspCommandDeviceTimerInternet;
import com.fuzi.bj.iothouse.device.IEspDevice;

public class EspActionDeviceTimerGetInternet implements IEspActionDeviceTimerGetInternet
{
    
    @Override
    public boolean doActionDeviceTimerGet(IEspDevice device)
    {
        IEspCommandDeviceTimerInternet command = new EspCommandDeviceTimerInternet(device);
        return command.doCommandDeviceTimerGet();
    }
    
}
