package com.iothouse.framework.device.builder;

import com.iothouse.framework.device.IEspDeviceLight;
import com.iothouse.framework.model.device.EspDeviceLight;

public class BEspDeviceLight implements IBEspDeviceLight
{
    private BEspDeviceLight()
    {
    }
    
    private static class InstanceHolder
    {
        static BEspDeviceLight instance = new BEspDeviceLight();
    }
    
    public static BEspDeviceLight getInstance()
    {
        return InstanceHolder.instance;
    }
    
    @Override
    public IEspDeviceLight alloc()
    {
        return new EspDeviceLight();
    }
    
}
