package com.fuzi.bj.iothouse.action.device.common;

import com.fuzi.bj.iothouse.action.IEspActionDevice;
import com.fuzi.bj.iothouse.action.IEspActionInternet;

public interface IEspActionDeviceGenerateShareKeyInternet extends IEspActionInternet, IEspActionDevice
{
    /**
     * Get share key from Server
     * 
     * @param ownerDeviceKey
     * @return the share key of the device
     */
    String doActionDeviceGenerateShareKeyInternet(String ownerDeviceKey);
}
