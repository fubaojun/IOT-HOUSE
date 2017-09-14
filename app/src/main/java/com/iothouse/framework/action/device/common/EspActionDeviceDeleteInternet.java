package com.iothouse.framework.action.device.common;

import com.iothouse.framework.command.device.common.EspCommandDeviceDeleteInternet;
import com.iothouse.framework.command.device.common.IEspCommandDeviceDeleteInternet;

public class EspActionDeviceDeleteInternet implements IEspActionDeviceDeleteInternet
{
    
    @Override
    public boolean doActionDeviceDeleteInternet(String deviceKey)
    {
        IEspCommandDeviceDeleteInternet command = new EspCommandDeviceDeleteInternet();
        return command.doCommandDeviceDeleteInternet(deviceKey);
    }
    
}
