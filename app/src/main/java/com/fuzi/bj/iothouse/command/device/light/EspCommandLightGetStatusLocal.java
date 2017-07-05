package com.fuzi.bj.iothouse.command.device.light;

import com.fuzi.bj.iothouse.base.api.EspBaseApiUtil;
import com.fuzi.bj.iothouse.type.device.status.EspStatusLight;
import com.fuzi.bj.iothouse.type.device.status.IEspStatusLight;

//import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.InetAddress;

public class EspCommandLightGetStatusLocal implements IEspCommandLightGetStatusLocal
{
//    private final static Logger log = Logger.getLogger(EspCommandLightGetStatusLocal.class);
    
    @Override
    public String getLocalUrl(InetAddress inetAddress)
    {
        return "http://" + inetAddress.getHostAddress() + "/" + "config?command=light";
    }
    
    private IEspStatusLight getCurrentLightStatus2(InetAddress inetAddress, String deviceBssid, boolean isMeshDevice)
    {
        String uriString = getLocalUrl(inetAddress);
        JSONObject jo = null;
        if (deviceBssid == null || !isMeshDevice)
        {
            jo = EspBaseApiUtil.Get(uriString);
        }
        else
        {
//            jo = EspBaseApiUtil.GetForJson(uriString, deviceBssid);
        }
        if (jo == null)
        {
            return null;
        }
        try
        {
            int period = jo.getInt(Period);
            JSONObject rgb = jo.getJSONObject(Rgb);
            int red = rgb.getInt(Red);
            int green = rgb.getInt(Green);
            int blue = rgb.getInt(Blue);
            int cwhite = rgb.getInt(CWhite);
            int wwhite = rgb.getInt(WWhite);
            IEspStatusLight status = new EspStatusLight();
            status.setPeriod(period);
            status.setRed(red);
            status.setGreen(green);
            status.setBlue(blue);
            status.setCWhite(cwhite);
            status.setWWhite(wwhite);
            return status;
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public IEspStatusLight doCommandLightGetStatusLocal(InetAddress inetAddress)
    {
        IEspStatusLight result = getCurrentLightStatus2(inetAddress, null, false);
//        log.debug(Thread.currentThread().toString() + "##doCommandLightGetStatusLocal(inetAddress=[" + inetAddress
//            + "]): " + result);
        return result;
    }
    
    @Override
    public IEspStatusLight doCommandLightGetStatusLocal(InetAddress inetAddress, String deviceBssid,
                                                        boolean isMeshDevice)
    {
        IEspStatusLight result = getCurrentLightStatus2(inetAddress, deviceBssid, isMeshDevice);
//        log.debug(Thread.currentThread().toString() + "##doCommandLightGetStatusLocal(inetAddress=[" + inetAddress
//            + "],deviceBssid=[" + deviceBssid + "],isMeshDevice=[" + isMeshDevice + "]): " + result);
        return result;
    }
    
}
