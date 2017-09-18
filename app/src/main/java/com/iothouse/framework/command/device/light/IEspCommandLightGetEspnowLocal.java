package com.iothouse.framework.command.device.light;

import com.iothouse.framework.command.IEspCommandLocal;
import com.iothouse.framework.command.device.IEspCommandLight;
//import com.iothouse.type.device.status.IEspStatusEspnow;


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
