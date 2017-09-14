package com.iothouse.framework.action.device.common;

import com.iothouse.framework.action.IEspActionDevice;
import com.iothouse.framework.action.IEspActionInternet;

public interface IEspActionDeviceRenameInternet extends IEspActionInternet, IEspActionDevice
{
    /**
     * rename the device on Server
     * 
     * @param deviceKey the device's key
     * @param deviceName the device's new name
     * @return whether the command executed suc
     */
    boolean doActionDeviceRenameInternet(String deviceKey, String deviceName);
}
