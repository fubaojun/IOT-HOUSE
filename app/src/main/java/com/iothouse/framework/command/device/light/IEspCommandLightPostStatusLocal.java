package com.iothouse.framework.command.device.light;

import com.iothouse.framework.command.IEspCommandLocal;
import com.iothouse.framework.command.device.IEspCommandLight;
import com.iothouse.framework.type.device.status.IEspStatusLight;

import java.net.InetAddress;
import java.util.List;

public interface IEspCommandLightPostStatusLocal extends IEspCommandLocal, IEspCommandLight
{
    /**
     * @deprecated Use {@link #doCommandLightPostStatusLocal(InetAddress, IEspStatusLight, String, String)} instead of
     *             it, and the deviceBssid=null when you call the method
     * 
     *             post the statusLight to the Light by Local
     * 
     * @param inetAddress the Light's ip address
     * @param statusLight the status of Light
     * @return whether the command executed suc
     */
    boolean doCommandLightPostStatusLocal(InetAddress inetAddress, IEspStatusLight statusLight);
    
    /**
     * post the statusLight to the Light by Local
     * 
     * @param inetAddress the Light's ip address
     * @param statusLight the status of Light
     * @param deviceBssid the Light's bssid
     * @param isMeshDevice whether the Light is mesh device
     * @return whether the command executed suc
     */
    boolean doCommandLightPostStatusLocal(InetAddress inetAddress, IEspStatusLight statusLight, String deviceBssid,
                                          boolean isMeshDevice);

    /**
     * post the statusLight to the Light by Local Instantly(without response)
     *
     * @param inetAddress the Light's ip address
     * @param statusLight the status of Light
     * @param deviceBssid the Light's bssid
     * @param isMeshDevice whether the Light is mesh device
     * @param disconnectedCallback disconnected callback
     */
    void doCommandLightPostStatusLocalInstantly(InetAddress inetAddress, IEspStatusLight statusLight,
                                                String deviceBssid, boolean isMeshDevice, Runnable disconnectedCallback);
    
    /**
     * Post multicast status
     * 
     * @param inetAddress
     * @param statusLight
     * @param bssids
     * @return
     */
    boolean doCommandMulticastPostStatusLocal(InetAddress inetAddress, IEspStatusLight statusLight, List<String> bssids);
}
