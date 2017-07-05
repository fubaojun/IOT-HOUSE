package com.fuzi.bj.iothouse.device.builder;

import com.fuzi.bj.iothouse.device.IEspDeviceLight;
import com.fuzi.bj.iothouse.model.device.EspDeviceLight;

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
