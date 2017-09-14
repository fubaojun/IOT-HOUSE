package com.iothouse.framework.command.device.common;

import com.iothouse.framework.command.IEspCommandLocal;
import com.iothouse.framework.command.device.IEspCommandDevice;

public interface IEspCommandDeviceSleepRebootLocal extends IEspCommandLocal, IEspCommandDevice
{
    static final String URL_SLEEP = "http://192.168.4.1/config?command=sleep";
    
    static final String URL_REBOOT = "http://192.168.4.1/config?command=reboot";
    
    /**
     * Sleep the local device
     */
    void doCommandDeviceSleepLocal();
    
    /**
     * Reboot the local device
     */
    void doCommandDeviceRebootLocal();
}
