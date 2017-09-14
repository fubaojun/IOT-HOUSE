package com.iothouse.framework.device.array;

import com.iothouse.framework.device.IEspDevice;

import java.util.List;

public interface IEspDeviceArray extends IEspDevice
{
    void addDevice(IEspDevice device);
    
    void removeDevice(IEspDevice device);
    
    List<IEspDevice> getDeviceList();
}
