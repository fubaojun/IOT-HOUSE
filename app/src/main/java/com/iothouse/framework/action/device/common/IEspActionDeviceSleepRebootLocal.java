package com.iothouse.framework.action.device.common;

import com.iothouse.framework.action.IEspActionDevice;
import com.iothouse.framework.action.IEspActionLocal;
import com.iothouse.framework.type.device.EspDeviceType;

public interface IEspActionDeviceSleepRebootLocal extends IEspActionDevice, IEspActionLocal
{
    /**
     * Sleep or Reboot the device
     * 
     * @param type
     */
    void doActionDeviceSleepRebootLocal(EspDeviceType type);
}
