package com.fuzi.bj.iothouse.action.device.common;

import com.fuzi.bj.iothouse.command.device.common.EspCommandDeviceRenameInternet;
import com.fuzi.bj.iothouse.command.device.common.IEspCommandDeviceRenameInternet;

public class EspActionDeviceRenameInternet implements IEspActionDeviceRenameInternet
{
    
    @Override
    public boolean doActionDeviceRenameInternet(String deviceKey, String deviceName)
    {
        IEspCommandDeviceRenameInternet command = new EspCommandDeviceRenameInternet();
        return command.doCommandDeviceRenameInternet(deviceKey, deviceName);
    }
    
}
