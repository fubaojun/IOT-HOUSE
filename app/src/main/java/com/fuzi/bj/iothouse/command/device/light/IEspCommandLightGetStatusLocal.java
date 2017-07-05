package com.fuzi.bj.iothouse.command.device.light;

import com.fuzi.bj.iothouse.command.IEspCommandLocal;
import com.fuzi.bj.iothouse.command.device.IEspCommandLight;
import com.fuzi.bj.iothouse.type.device.status.IEspStatusLight;

import java.net.InetAddress;

public interface IEspCommandLightGetStatusLocal extends IEspCommandLocal, IEspCommandLight
{
    /**
     * @deprecated Use {@link #doCommandLightGetStatusLocal(InetAddress, String, String)} instead of it,
     * and the deviceBssid=null when you call the method
     * 
     * get the statusLight to the Light by Local
     * 
     * @param inetAddress the Light's ip address
     * @return the status of the Light or null(if executed fail)
     */
    IEspStatusLight doCommandLightGetStatusLocal(InetAddress inetAddress);
    
    /**
     * get the statusLight to the Light by Local
     * 
     * @param inetAddress the Light's ip address
     * @param deviceBssid the Light's bssid
     * @param isMeshDevice whether the Light is mesh device
     * @return the status of the Light or null(if executed fail)
     */
    IEspStatusLight doCommandLightGetStatusLocal(InetAddress inetAddress, String deviceBssid, boolean isMeshDevice);
}
