package com.iothouse.framework.action.device.common;

import com.iothouse.framework.action.IEspActionInternet;
import com.iothouse.framework.action.device.IEspActionActivated;
import com.iothouse.framework.device.IEspDevice;
import com.iothouse.framework.type.device.IEspDeviceStatus;

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
