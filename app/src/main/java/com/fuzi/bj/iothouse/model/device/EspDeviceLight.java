package com.fuzi.bj.iothouse.model.device;

import com.fuzi.bj.iothouse.device.IEspDeviceLight;
import com.fuzi.bj.iothouse.type.device.status.EspStatusLight;
import com.fuzi.bj.iothouse.type.device.status.IEspStatusLight;

public class EspDeviceLight extends EspDevice implements IEspDeviceLight
{
    private IEspStatusLight mStatusLight;
    
    public EspDeviceLight()
    {
        mStatusLight = new EspStatusLight();
    }
    
    @Override
    public Object clone()
        throws CloneNotSupportedException
    {
        EspDeviceLight device = (EspDeviceLight)super.clone();
        // deep copy
        IEspStatusLight status = device.getStatusLight();
        device.mStatusLight = (IEspStatusLight)((EspStatusLight)status).clone();
        return device;
    }
    
    @Override
    public IEspStatusLight getStatusLight()
    {
        return mStatusLight;
    }
    
    @Override
    public void setStatusLight(IEspStatusLight statusLight)
    {
        mStatusLight = statusLight;
    }
    
}
