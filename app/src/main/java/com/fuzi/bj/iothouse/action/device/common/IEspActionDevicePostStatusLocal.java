package com.fuzi.bj.iothouse.action.device.common;

import com.fuzi.bj.iothouse.action.IEspActionLocal;
import com.fuzi.bj.iothouse.action.device.IEspActionActivated;
import com.fuzi.bj.iothouse.action.device.IEspActionUnactivated;
import com.fuzi.bj.iothouse.device.IEspDevice;
import com.fuzi.bj.iothouse.type.device.IEspDeviceStatus;

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
