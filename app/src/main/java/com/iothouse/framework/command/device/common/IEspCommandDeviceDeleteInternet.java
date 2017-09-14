package com.iothouse.framework.command.device.common;

import com.iothouse.framework.command.IEspCommandInternet;
import com.iothouse.framework.command.device.IEspCommandActivated;

public interface IEspCommandDeviceDeleteInternet extends IEspCommandActivated, IEspCommandInternet
{
    static final String URL = "https://iot.espressif.cn//v1/key/?method=DELETE";
    /**
     * delete the device on Server
     * @param deviceKey the device's key
     * @return whether the command executed suc
     */
    boolean doCommandDeviceDeleteInternet(String deviceKey);
}
