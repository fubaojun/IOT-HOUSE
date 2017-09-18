package com.iothouse.framework.command.device.light;

import com.iothouse.framework.command.IEspCommandInternet;
import com.iothouse.framework.command.device.IEspCommandLight;
//import com.iothouse.type.device.status.IEspStatusEspnow;


public interface IEspCommandLightGetEspnowInternet extends IEspCommandInternet, IEspCommandLight
{
    static final String URL = "https://iot.espressif.cn/v1/device/rpc/?deliver_to_device=true&action=get_switches";
    
//    List<IEspStatusEspnow> doCommandLightGetEspnowInternet(String deviceKey);
}
