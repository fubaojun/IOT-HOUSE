package com.fuzi.bj.iothouse.command.device.common;

import com.fuzi.bj.iothouse.command.IEspCommandInternet;
import com.fuzi.bj.iothouse.command.device.IEspCommandActivated;

public interface IEspCommandDeviceGenerateShareKeyInternet extends IEspCommandActivated, IEspCommandInternet
{
    static final String URL = "https://iot.espressif.cn/v1/key/share/";
    
    /**
     * Get the share key from server
     * @param ownerDeviceKey
     * @return the share key of the device
     */
    String doCommandDeviceGenerateShareKey(String ownerDeviceKey);
}
