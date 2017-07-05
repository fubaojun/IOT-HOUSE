package com.fuzi.bj.iothouse.action.device.common;

import com.fuzi.bj.iothouse.command.device.common.EspCommandDeviceDeleteInternet;
import com.fuzi.bj.iothouse.command.device.common.IEspCommandDeviceDeleteInternet;

public class EspActionDeviceDeleteInternet implements IEspActionDeviceDeleteInternet
{
    
    @Override
    public boolean doActionDeviceDeleteInternet(String deviceKey)
    {
        IEspCommandDeviceDeleteInternet command = new EspCommandDeviceDeleteInternet();
        return command.doCommandDeviceDeleteInternet(deviceKey);
    }
    
}
