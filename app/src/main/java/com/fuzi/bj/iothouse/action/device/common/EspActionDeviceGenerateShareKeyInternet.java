package com.fuzi.bj.iothouse.action.device.common;

import com.fuzi.bj.iothouse.command.device.common.EspCommandDeviceGenerateShareKeyInternet;
import com.fuzi.bj.iothouse.command.device.common.IEspCommandDeviceGenerateShareKeyInternet;

public class EspActionDeviceGenerateShareKeyInternet implements IEspActionDeviceGenerateShareKeyInternet
{
    
    @Override
    public String doActionDeviceGenerateShareKeyInternet(String ownerDeviceKey)
    {
        IEspCommandDeviceGenerateShareKeyInternet command = new EspCommandDeviceGenerateShareKeyInternet();
        String shareKey = command.doCommandDeviceGenerateShareKey(ownerDeviceKey);
        return shareKey;
    }
    
}
