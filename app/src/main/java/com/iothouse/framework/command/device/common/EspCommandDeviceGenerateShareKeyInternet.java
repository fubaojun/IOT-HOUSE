package com.iothouse.framework.command.device.common;

import com.iothouse.framework.base.api.EspBaseApiUtil;
import com.iothouse.framework.type.net.HeaderPair;

import org.apache.http.HttpStatus;
import org.json.JSONException;
import org.json.JSONObject;

public class EspCommandDeviceGenerateShareKeyInternet implements IEspCommandDeviceGenerateShareKeyInternet
{
    
    @Override
    public String doCommandDeviceGenerateShareKey(String ownerDeviceKey)
    {
        JSONObject jsonObject = new JSONObject();
        try
        {
            jsonObject.put(Scope, Device);
        }
        catch (JSONException e)
        {
            e.printStackTrace();
            return null;
        }
        
        HeaderPair header = new HeaderPair(Authorization, "token " + ownerDeviceKey);
        JSONObject result = EspBaseApiUtil.Post(URL, jsonObject, header);
        
        if (result == null)
        {
            return null;
        }
        
        try
        {
            int status = result.getInt(Status);
            if (status != HttpStatus.SC_OK)
            {
                return null;
            }
            
            String shareKey = result.getString(Token);
            return shareKey;
        }
        catch (JSONException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
}
