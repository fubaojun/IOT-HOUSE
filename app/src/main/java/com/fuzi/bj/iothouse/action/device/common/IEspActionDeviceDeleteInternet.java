package com.fuzi.bj.iothouse.action.device.common;

import com.fuzi.bj.iothouse.action.IEspActionDevice;
import com.fuzi.bj.iothouse.action.IEspActionInternet;

public interface IEspActionDeviceDeleteInternet extends IEspActionInternet, IEspActionDevice
{
    /**
     * delete the device on Server
     * 
     * @param deviceKey the device's key
     * @return whether the command executed suc
     */
    boolean doActionDeviceDeleteInternet(String deviceKey);
}
