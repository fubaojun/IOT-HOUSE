package com.iothouse.framework.command.device.common;

import com.iothouse.framework.base.api.EspBaseApiUtil;
import com.iothouse.framework.type.net.HeaderPair;

import org.apache.http.HttpStatus;
//import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

public class EspCommandDeviceRenameInternet implements IEspCommandDeviceRenameInternet
{
//    private final static Logger log = Logger.getLogger(EspCommandDeviceRenameInternet.class);
    
    private boolean editDevice(String deviceKey, String deviceName)
    {
        
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObjectDeviceName = new JSONObject();
        String headerKey = Authorization;
        String headerValue = "token " + deviceKey;
        HeaderPair header = new HeaderPair(headerKey, headerValue);
        
        JSONObject result = null;
        
        try
        {
            jsonObjectDeviceName.put(Name, deviceName);
            jsonObject.put(Device, jsonObjectDeviceName);
        }
        catch (JSONException e1)
        {
            e1.printStackTrace();
        }
        
        result = EspBaseApiUtil.Post(URL, jsonObject, header);
        
        int status = -1;
        try
        {
            if (result != null)
            {
                status = result.getInt(Status);
            }
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        if (HttpStatus.SC_OK == status)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    @Override
    public boolean doCommandDeviceRenameInternet(String deviceKey, String deviceName)
    {
        boolean result = editDevice(deviceKey, deviceName);
//        log.debug(Thread.currentThread().toString() + "##doCommandDeviceRenameInternet(deviceKey=[" + deviceKey
//            + "],deviceName=[" + deviceName + "]): " + result);
        return result;
    }
    
}
