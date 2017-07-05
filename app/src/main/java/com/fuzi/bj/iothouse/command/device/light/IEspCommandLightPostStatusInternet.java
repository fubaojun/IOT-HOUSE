package com.fuzi.bj.iothouse.command.device.light;

import com.fuzi.bj.iothouse.command.IEspCommandInternet;
import com.fuzi.bj.iothouse.command.device.IEspCommandLight;
import com.fuzi.bj.iothouse.type.device.status.IEspStatusLight;

import java.util.List;

public interface IEspCommandLightPostStatusInternet extends IEspCommandInternet, IEspCommandLight
{
    static final String URL = "https://iot.espressif.cn/v1/datastreams/light/datapoint/?deliver_to_device=true";
    
    /**
     * post the statusLight to the Light by Internet
     * 
     * @param deviceKey the device's key
     * @param statusLight the status of Light
     * @return whether the command executed suc
     */
    boolean doCommandLightPostStatusInternet(String deviceKey, IEspStatusLight statusLight);
    
    /**
     * post multicast by Internet
     * 
     * @param deviceKey
     * @param statusLight
     * @param bssids
     * @return
     */
    boolean doCommandMulticastPostStatusInternet(String deviceKey, IEspStatusLight statusLight, List<String> bssids);
}