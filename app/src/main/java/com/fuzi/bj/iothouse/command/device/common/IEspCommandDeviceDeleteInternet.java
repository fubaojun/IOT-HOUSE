package com.fuzi.bj.iothouse.command.device.common;

import com.fuzi.bj.iothouse.command.IEspCommandInternet;
import com.fuzi.bj.iothouse.command.device.IEspCommandActivated;

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
