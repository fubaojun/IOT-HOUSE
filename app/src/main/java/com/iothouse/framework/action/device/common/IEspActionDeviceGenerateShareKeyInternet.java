package com.iothouse.framework.action.device.common;

import com.iothouse.framework.action.IEspActionDevice;
import com.iothouse.framework.action.IEspActionInternet;

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
