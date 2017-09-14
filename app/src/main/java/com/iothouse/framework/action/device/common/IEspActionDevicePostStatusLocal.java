package com.iothouse.framework.action.device.common;

import com.iothouse.framework.action.IEspActionLocal;
import com.iothouse.framework.action.device.IEspActionActivated;
import com.iothouse.framework.action.device.IEspActionUnactivated;
import com.iothouse.framework.device.IEspDevice;
import com.iothouse.framework.type.device.IEspDeviceStatus;

public interface IEspActionDevicePostStatusLocal extends IEspActionActivated, IEspActionUnactivated, IEspActionLocal
{
    static final int FIRST_CHILD_LEVEL = 2;
    
    /**
     * post the status to device via local
     * 
     * @param device the device
     * @param status the new status
     * @return whether the post action is suc
     */
    boolean doActionDevicePostStatusLocal(final IEspDevice device, final IEspDeviceStatus status);
    
}
