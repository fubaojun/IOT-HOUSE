package com.fuzi.bj.iothouse.action.device.common;

import com.fuzi.bj.iothouse.action.IEspActionDevice;
import com.fuzi.bj.iothouse.action.IEspActionInternet;
import com.fuzi.bj.iothouse.device.IEspDevice;

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
