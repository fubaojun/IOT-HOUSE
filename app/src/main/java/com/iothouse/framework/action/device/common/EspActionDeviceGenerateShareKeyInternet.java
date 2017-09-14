package com.iothouse.framework.action.device.common;

import com.iothouse.framework.command.device.common.EspCommandDeviceGenerateShareKeyInternet;
import com.iothouse.framework.command.device.common.IEspCommandDeviceGenerateShareKeyInternet;

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
