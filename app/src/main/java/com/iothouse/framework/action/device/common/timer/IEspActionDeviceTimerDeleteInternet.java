package com.iothouse.framework.action.device.common.timer;

import com.iothouse.framework.action.IEspActionDevice;
import com.iothouse.framework.action.IEspActionInternet;
import com.iothouse.framework.device.IEspDevice;

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
