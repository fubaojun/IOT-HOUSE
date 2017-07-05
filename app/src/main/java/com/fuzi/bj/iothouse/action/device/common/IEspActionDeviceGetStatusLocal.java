package com.fuzi.bj.iothouse.action.device.common;

import com.fuzi.bj.iothouse.action.IEspActionLocal;
import com.fuzi.bj.iothouse.action.device.IEspActionActivated;
import com.fuzi.bj.iothouse.action.device.IEspActionUnactivated;
import com.fuzi.bj.iothouse.device.IEspDevice;

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
