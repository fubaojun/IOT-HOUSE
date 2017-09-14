package com.iothouse.framework.command.device.light;

import com.iothouse.framework.command.IEspCommandInternet;
import com.iothouse.framework.command.device.IEspCommandLight;
import com.iothouse.framework.type.device.status.IEspStatusLight;

public interface IEspCommandLightGetStatusInternet extends IEspCommandInternet, IEspCommandLight
{
    static final String URL = "https://iot.espressif.cn/v1/datastreams/light/datapoint/?deliver_to_device=true";
    
    /**
     * get the statusLight to the Light by Internet
     * 
     * @param deviceKey the device key
     * @return the status of the Light or null(if executed fail)
     */
    IEspStatusLight doCommandLightGetStatusInternet(String deviceKey);
}
