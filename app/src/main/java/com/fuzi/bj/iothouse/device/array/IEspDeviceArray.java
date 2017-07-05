package com.fuzi.bj.iothouse.device.array;

import com.fuzi.bj.iothouse.device.IEspDevice;

import java.util.List;

public interface IEspDeviceArray extends IEspDevice
{
    void addDevice(IEspDevice device);
    
    void removeDevice(IEspDevice device);
    
    List<IEspDevice> getDeviceList();
}
