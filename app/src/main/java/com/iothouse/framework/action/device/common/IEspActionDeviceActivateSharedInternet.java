package com.iothouse.framework.action.device.common;

import com.iothouse.framework.action.IEspActionDevice;
import com.iothouse.framework.action.IEspActionInternet;
import com.iothouse.framework.device.IEspDevice;

public interface IEspActionDeviceActivateSharedInternet extends IEspActionInternet, IEspActionDevice
{
    /**
     * Get the shared device
     * 
     * @param userId the user id
     * @param userKey the user need get the device
     * @param sharedDeviceKey the shared device key
     * @return the activate shared device
     */
    IEspDevice doActionDeviceActivateSharedInternet(long userId, String userKey, String sharedDeviceKey);
}
