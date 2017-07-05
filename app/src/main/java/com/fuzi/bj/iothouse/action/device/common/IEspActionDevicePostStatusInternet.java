package com.fuzi.bj.iothouse.action.device.common;

import com.fuzi.bj.iothouse.action.IEspActionInternet;
import com.fuzi.bj.iothouse.action.device.IEspActionActivated;
import com.fuzi.bj.iothouse.device.IEspDevice;
import com.fuzi.bj.iothouse.type.device.IEspDeviceStatus;

public interface IEspActionDevicePostStatusInternet extends IEspActionActivated, IEspActionInternet
{
    static int FIRST_CHILD_LEVEL = 1;
    /**
     * post the status to device via Internet
     * 
     * @param device the device
     * @param status the new status
     * @return whether the post action is suc
     */
    boolean doActionDevicePostStatusInternet(final IEspDevice device, final IEspDeviceStatus status);
    
}
