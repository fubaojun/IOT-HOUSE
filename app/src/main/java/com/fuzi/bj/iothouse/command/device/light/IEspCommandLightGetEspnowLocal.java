package com.fuzi.bj.iothouse.command.device.light;

import com.fuzi.bj.iothouse.command.IEspCommandLocal;
import com.fuzi.bj.iothouse.command.device.IEspCommandLight;
//import com.fuzi.bj.iothouse.type.device.status.IEspStatusEspnow;

import java.net.InetAddress;
import java.util.List;

public interface IEspCommandLightGetEspnowLocal extends IEspCommandLight, IEspCommandLocal
{
    /**
     * Get battery status of the Espnow which control the light
     * 
     * @param inetAddress the Light's ip address
     * @param deviceBssid the Light's bssid
     * @param isMeshDevice whether the Light is mesh device
     * @return battery status of the Espnow which control the light
     */
//    List<IEspStatusEspnow> doCommandLightGetEspnowLocal(InetAddress inetAddress, String deviceBssid,
//                                                        boolean isMeshDevice);
}
