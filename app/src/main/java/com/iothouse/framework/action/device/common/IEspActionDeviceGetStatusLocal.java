package com.iothouse.framework.action.device.common;

import com.iothouse.framework.action.IEspActionLocal;
import com.iothouse.framework.action.device.IEspActionActivated;
import com.iothouse.framework.action.device.IEspActionUnactivated;
import com.iothouse.framework.device.IEspDevice;

public interface IEspActionDeviceGetStatusLocal extends IEspActionActivated, IEspActionUnactivated, IEspActionLocal
{
    /**
     * get the current status of device via local
     * 
     * @param device the device
     * @return whether the get action is suc
     */
    boolean doActionDeviceGetStatusLocal(final IEspDevice device);
}
