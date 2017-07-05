package com.fuzi.bj.iothouse.action.device.common.timer;

import com.fuzi.bj.iothouse.action.IEspActionDevice;
import com.fuzi.bj.iothouse.action.IEspActionInternet;
import com.fuzi.bj.iothouse.device.IEspDevice;

public interface IEspActionDeviceTimerDeleteInternet extends IEspActionDevice, IEspActionInternet
{
    /**
     * Delete the timer
     * 
     * @param device
     * @param timerId
     * @return delete the timer suc or failed
     */
    boolean doActionDeviceTimerDeleteInternet(IEspDevice device, long timerId);
}
