package com.iothouse.framework.action.device.common.timer;

import com.iothouse.framework.action.IEspActionDevice;
import com.iothouse.framework.action.IEspActionInternet;
import com.iothouse.framework.device.IEspDevice;

public interface IEspActionDeviceTimerGetInternet extends IEspActionDevice, IEspActionInternet
{
    /**
     * Get timers from server
     * 
     * @param device
     * @return get timers suc or failed
     */
    boolean doActionDeviceTimerGet(IEspDevice device);
}
