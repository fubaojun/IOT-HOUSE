package com.iothouse.framework.action.device.common.timer;

import com.iothouse.framework.command.device.common.EspCommandDeviceTimerInternet;
import com.iothouse.framework.command.device.common.IEspCommandDeviceTimerInternet;
import com.iothouse.framework.device.IEspDevice;

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
