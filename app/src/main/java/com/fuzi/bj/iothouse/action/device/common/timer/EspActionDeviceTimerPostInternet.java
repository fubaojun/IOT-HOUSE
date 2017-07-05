package com.fuzi.bj.iothouse.action.device.common.timer;

import com.fuzi.bj.iothouse.command.device.common.EspCommandDeviceTimerInternet;
import com.fuzi.bj.iothouse.command.device.common.IEspCommandDeviceTimerInternet;
import com.fuzi.bj.iothouse.device.IEspDevice;

import org.json.JSONObject;

public class EspActionDeviceTimerPostInternet implements IEspActionDeviceTimerPostInternet
{
    
    @Override
    public boolean doActionDeviceTimerPostInternet(IEspDevice device, JSONObject timerJSON)
    {
        IEspCommandDeviceTimerInternet command = new EspCommandDeviceTimerInternet(device);
        return command.doCommandDeviceTimerPost(timerJSON);
    }
    
}
