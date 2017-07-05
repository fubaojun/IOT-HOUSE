package com.fuzi.bj.iothouse.command.device.light;

import com.fuzi.bj.iothouse.command.IEspCommandInternet;
import com.fuzi.bj.iothouse.command.device.IEspCommandLight;
//import com.fuzi.bj.iothouse.type.device.status.IEspStatusEspnow;

import java.util.List;

public interface IEspCommandLightGetEspnowInternet extends IEspCommandInternet, IEspCommandLight
{
    static final String URL = "https://iot.espressif.cn/v1/device/rpc/?deliver_to_device=true&action=get_switches";
    
//    List<IEspStatusEspnow> doCommandLightGetEspnowInternet(String deviceKey);
}
