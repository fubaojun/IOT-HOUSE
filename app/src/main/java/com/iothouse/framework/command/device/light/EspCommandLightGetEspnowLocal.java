package com.iothouse.framework.command.device.light;

//import com.iothouse.type.device.status.EspStatusEspnow;
//import com.iothouse.type.device.status.IEspStatusEspnow;

import java.net.InetAddress;

public class EspCommandLightGetEspnowLocal implements IEspCommandLightGetEspnowLocal
{
    
    @Override
    public String getLocalUrl(InetAddress inetAddress)
    {
        return "http://" + inetAddress.getHostAddress() + "/" + "config?command=switches";
    }
    
//    @Override
//    public List<IEspStatusEspnow> doCommandLightGetEspnowLocal(InetAddress inetAddress, String deviceBssid,
//                                                               boolean isMeshDevice)
//    {
//        String uriString = getLocalUrl(inetAddress);
//        JSONObject jo = null;
//        if (deviceBssid == null || !isMeshDevice)
//        {
//            jo = EspBaseApiUtil.Get(uriString);
//        }
//        else
//        {
//            jo = EspBaseApiUtil.GetForJson(uriString, deviceBssid);
//        }
//        if (jo == null)
//        {
//            return null;
//        }
//
//        try
//        {
//            List<IEspStatusEspnow> list = new ArrayList<IEspStatusEspnow>();
//            JSONArray switchArray = jo.getJSONArray(Switches);
//            for (int i = 0; i < switchArray.length(); i++)
//            {
//
//                JSONObject switchJSON = switchArray.getJSONObject(i);
//                // check whether the espnow result is valid
//                String status = switchJSON.getString(Status);
//                if (!status.equals(StatusOK))
//                {
//                    continue;
//                }
//                String mac = switchJSON.getString(Mac);
//                int voltage = switchJSON.getInt(VoltageMV);
//
//                IEspStatusEspnow espnowStatus = new EspStatusEspnow();
//                espnowStatus.setMac(mac);
//                espnowStatus.setVoltage(voltage);
//                list.add(espnowStatus);
//            }
//
//            return list;
//        }
//        catch (JSONException e)
//        {
//            e.printStackTrace();
//        }
//        return null;
//    }
    
}
