package com.fuzi.bj.iothouse.model.device.array;

import com.fuzi.bj.iothouse.device.IEspDevice;
import com.fuzi.bj.iothouse.device.array.IEspDeviceArray;
import com.fuzi.bj.iothouse.device.builder.BEspDevice;
import com.fuzi.bj.iothouse.model.device.EspDeviceLight;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EspDeviceLightArray extends EspDeviceLight implements IEspDeviceArray
{
    private Set<IEspDevice> mDeviceSet;
    
    public EspDeviceLightArray()
    {
        mDeviceSet = new HashSet<IEspDevice>();
    }
    
    @Override
    public synchronized void addDevice(IEspDevice device)
    {
//        if (device instanceof IEspDeviceSSS)
//        {
//            device = BEspDevice.convertSSSToTypeDevice((IEspDeviceSSS)device);
//        }
        mDeviceSet.add(device);
    }

    @Override
    public synchronized void removeDevice(IEspDevice device)
    {
        if (mDeviceSet.contains(device))
        {
            mDeviceSet.remove(device);
        }
    }

    @Override
    public synchronized List<IEspDevice> getDeviceList()
    {
        List<IEspDevice> devices = new ArrayList<IEspDevice>();
        devices.addAll(mDeviceSet);
        return devices;
    }
}
