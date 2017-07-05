package com.fuzi.bj.iothouse.action.device.common;

import com.fuzi.bj.iothouse.action.IEspActionDevice;
import com.fuzi.bj.iothouse.action.IEspActionLocal;
import com.fuzi.bj.iothouse.type.device.EspDeviceType;

public interface IEspActionDeviceSleepRebootLocal extends IEspActionDevice, IEspActionLocal
{
    /**
     * Sleep or Reboot the device
     * 
     * @param type
     */
    void doActionDeviceSleepRebootLocal(EspDeviceType type);
}
