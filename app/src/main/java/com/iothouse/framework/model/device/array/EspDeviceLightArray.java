package com.iothouse.framework.model.device.array;

import com.iothouse.framework.device.IEspDevice;
import com.iothouse.framework.device.array.IEspDeviceArray;
import com.iothouse.framework.model.device.EspDeviceLight;

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
