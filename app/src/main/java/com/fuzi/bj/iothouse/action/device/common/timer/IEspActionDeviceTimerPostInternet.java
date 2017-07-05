package com.fuzi.bj.iothouse.action.device.common.timer;

import com.fuzi.bj.iothouse.action.IEspActionDevice;
import com.fuzi.bj.iothouse.action.IEspActionInternet;
import com.fuzi.bj.iothouse.device.IEspDevice;

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
