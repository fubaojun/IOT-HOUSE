package com.iothouse.framework.command.device.light;

//import com.iothouse.type.device.status.EspStatusEspnow;
//import com.iothouse.type.device.status.IEspStatusEspnow;


public class EspCommandLightGetEspnowInternet implements IEspCommandLightGetEspnowInternet
{

//    @Override
//    public List<IEspStatusEspnow> doCommandLightGetEspnowInternet(String deviceKey)
//    {
//        String headerKey = Authorization;
//        String headerValue = Token + " " + deviceKey;
//        HeaderPair header = new HeaderPair(headerKey, headerValue);
//        JSONObject result = EspBaseApiUtil.Get(URL, header);
//        if (result == null)
//        {
//            return null;
//        }
//        try
//        {
//            int statusInt = result.getInt(Status);
//            if (statusInt != HttpStatus.SC_OK)
//            {
//                return null;
//            }
//
//            List<IEspStatusEspnow> list = new ArrayList<IEspStatusEspnow>();
//            JSONArray switchArray = result.getJSONArray(Switches);
//            for (int i = 0; i < switchArray.length(); i++)
//            {
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
//            return null;
//        }
//    }
    
}
