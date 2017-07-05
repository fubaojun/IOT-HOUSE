package com.fuzi.bj.iothouse.action.longsocket2;

import com.fuzi.bj.iothouse.type.device.IEspDeviceState;
import com.fuzi.bj.iothouse.type.device.IEspDeviceStatus;

import java.net.InetAddress;

public interface IEspActionLongSocket
{
    /**
     * add the status to be sent
     * 
     * @param deviceKey the device's device key
     * @param inetAddress the device's ip address
     * @param status the status to be sent
     * @param state the statue of the device
     * @param disconnectedCallback disconnected callback
     */
    void addStatus(String deviceKey, InetAddress inetAddress, IEspDeviceStatus status, IEspDeviceState state,
                   Runnable disconnectedCallback);

    /**
     * add the status to be sent of mesh device
     *
     * @param deviceKey the device's device key
     * @param inetAddress the device's ip address
     * @param bssid the device's bssid
     * @param status the status to be sent
     * @param state the statue of the device
     * @param disconnectedCallback disconnected callback
     */
    void addMeshStatus(String deviceKey, InetAddress inetAddress, String bssid, IEspDeviceStatus status,
                       IEspDeviceState state, Runnable disconnectedCallback);
    
    /**
     * start the background task
     */
    void start();
    
    /**
     * stop the background task
     */
    void stop();
}
