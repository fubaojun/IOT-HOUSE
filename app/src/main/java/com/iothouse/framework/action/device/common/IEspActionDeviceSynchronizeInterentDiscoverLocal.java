package com.iothouse.framework.action.device.common;

import com.iothouse.framework.action.IEspActionInternet;
import com.iothouse.framework.action.IEspActionLocal;
import com.iothouse.framework.action.device.IEspActionActivated;
import com.iothouse.framework.command.IEspCommandUser;

public interface IEspActionDeviceSynchronizeInterentDiscoverLocal extends IEspCommandUser, IEspActionActivated,
        IEspActionLocal, IEspActionInternet
{
    /**
     * The min times that send UDP Broadcast when onRefreshing
     */
    static final int UDP_EXECUTE_MIN_TIMES = 1;
    
    /**
     * The max times that send UDP Broadcast when onRefreshing
     */
    static final int UDP_EXECUTE_MAX_TIMES = 5;
    
    /**
     * Synchronize devices from Server and Discovery devices on local
     * 
     * @param userKey the user key
     */
    void doActionDeviceSynchronizeInterentDiscoverLocal(final String userKey);
    
    /**
     * Synchronize devices from Discovery devices on local only
     * @param isSyn whether execute it syn or asyn
     */
    void doActionDeviceSynchronizeDiscoverLocal(boolean isSyn);
    
    /**
     * Synchronize devices from Server only
     * @param userKey the user key
     */
    void doActionDeviceSynchronizeInternet(final String userKey);
}
