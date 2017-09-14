package com.iothouse.framework.action.device.common;

import com.iothouse.framework.action.IEspActionInternet;
import com.iothouse.framework.action.device.IEspActionActivated;
import com.iothouse.framework.device.IEspDevice;

public interface IEspActionDeviceGetStatusInternet extends IEspActionActivated, IEspActionInternet
{
    /**
     * get the current status of device via internet)
     * 
     * @param device the device
     * @return whether the get action is suc
     */
    boolean doActionDeviceGetStatusInternet(final IEspDevice device);
}
