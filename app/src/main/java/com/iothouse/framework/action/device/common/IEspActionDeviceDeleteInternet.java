package com.iothouse.framework.action.device.common;

import com.iothouse.framework.action.IEspActionDevice;
import com.iothouse.framework.action.IEspActionInternet;

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
