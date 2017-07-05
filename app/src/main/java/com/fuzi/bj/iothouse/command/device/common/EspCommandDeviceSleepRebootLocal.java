package com.fuzi.bj.iothouse.command.device.common;

import com.fuzi.bj.iothouse.base.api.EspBaseApiUtil;

import java.net.InetAddress;

public class EspCommandDeviceSleepRebootLocal implements IEspCommandDeviceSleepRebootLocal
{
    
    @Override
    public void doCommandDeviceSleepLocal()
    {
        EspBaseApiUtil.Post(URL_SLEEP, null);
    }
    
    @Override
    public void doCommandDeviceRebootLocal()
    {
        EspBaseApiUtil.Post(URL_REBOOT, null);
    }
    
    @Override
    public String getLocalUrl(InetAddress inetAddress)
    {
        throw new RuntimeException("EspCommandDeviceSleepRebootLocal don't support getLocalUrl");
    }
    
}
