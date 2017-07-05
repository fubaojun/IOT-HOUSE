package com.fuzi.bj.iothouse.command.device.light;

import com.fuzi.bj.iothouse.base.api.EspBaseApiUtil;
//import com.fuzi.bj.iothouse.command.device.plug.EspCommandPlugGetStatusInternet;
import com.fuzi.bj.iothouse.type.device.status.EspStatusLight;
import com.fuzi.bj.iothouse.type.device.status.IEspStatusLight;
import com.fuzi.bj.iothouse.type.net.HeaderPair;

import org.apache.http.HttpStatus;
//import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

public class EspCommandLightGetStatusInternet implements IEspCommandLightGetStatusInternet
{
    
//    private final static Logger log = Logger.getLogger(EspCommandPlugGetStatusInternet.class);
    
    private IEspStatusLight getCurrentLightStatus(String deviceKey)
    {
        String headerKey = Authorization;
        String headerValue = Token + " " + deviceKey;
        JSONObject result = null;
        HeaderPair header = new HeaderPair(headerKey, headerValue);
        result = EspBaseApiUtil.Get(URL, header);
        if (result == null)
        {
            return null;
        }
        try
        {
            int status = -1;
            try
            {
                if (result != null)
                {
                    status = Integer.parseInt(result.getString(Status));
                }
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
            if (status == HttpStatus.SC_OK)
            {
                JSONObject data = result.getJSONObject(Datapoint);
                int period = data.getInt(X);
                int red = data.getInt(Y);
                int green = data.getInt(Z);
                int blue = data.getInt(K);
                int white = data.getInt(L);
                IEspStatusLight statusLight = new EspStatusLight();
                statusLight.setPeriod(period);
                statusLight.setRed(red);
                statusLight.setGreen(green);
                statusLight.setBlue(blue);
                statusLight.setCWhite(white);
                statusLight.setWWhite(white);
                return statusLight;
            }
            else
            {
                return null;
            }
        }
        catch (JSONException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public IEspStatusLight doCommandLightGetStatusInternet(String deviceKey)
    {
        IEspStatusLight result = getCurrentLightStatus(deviceKey);
//        log.debug(Thread.currentThread().toString() + "##doCommandLightGetStatusInternet(deviceKey=[" + deviceKey
//            + "]): " + result);
        return result;
    }
    
}
