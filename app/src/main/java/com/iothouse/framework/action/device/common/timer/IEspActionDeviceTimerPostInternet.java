package com.iothouse.framework.action.device.common.timer;

import com.iothouse.framework.action.IEspActionDevice;
import com.iothouse.framework.action.IEspActionInternet;
import com.iothouse.framework.device.IEspDevice;

import org.json.JSONObject;

public interface IEspActionDeviceTimerPostInternet extends IEspActionDevice, IEspActionInternet
{
    /**
     * Post the edited timer to the server
     * 
     * @param device
     * @param timerJSON
     * @return edit timer suc or failed
     */
    boolean doActionDeviceTimerPostInternet(IEspDevice device, JSONObject timerJSON);
}
