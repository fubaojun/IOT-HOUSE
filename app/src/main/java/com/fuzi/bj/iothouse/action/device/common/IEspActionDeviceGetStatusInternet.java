package com.fuzi.bj.iothouse.action.device.common;

import com.fuzi.bj.iothouse.action.IEspActionInternet;
import com.fuzi.bj.iothouse.action.device.IEspActionActivated;
import com.fuzi.bj.iothouse.device.IEspDevice;

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
