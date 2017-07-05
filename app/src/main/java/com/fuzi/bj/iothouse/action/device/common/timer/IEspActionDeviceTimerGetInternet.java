package com.fuzi.bj.iothouse.action.device.common.timer;

import com.fuzi.bj.iothouse.action.IEspActionDevice;
import com.fuzi.bj.iothouse.action.IEspActionInternet;
import com.fuzi.bj.iothouse.device.IEspDevice;

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
