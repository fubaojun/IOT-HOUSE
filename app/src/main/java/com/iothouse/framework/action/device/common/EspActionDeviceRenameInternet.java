package com.iothouse.framework.action.device.common;

import com.iothouse.framework.command.device.common.EspCommandDeviceRenameInternet;
import com.iothouse.framework.command.device.common.IEspCommandDeviceRenameInternet;

public class EspActionDeviceRenameInternet implements IEspActionDeviceRenameInternet
{
    
    @Override
    public boolean doActionDeviceRenameInternet(String deviceKey, String deviceName)
    {
        IEspCommandDeviceRenameInternet command = new EspCommandDeviceRenameInternet();
        return command.doCommandDeviceRenameInternet(deviceKey, deviceName);
    }
    
}
