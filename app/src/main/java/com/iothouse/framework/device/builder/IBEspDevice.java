package com.iothouse.framework.device.builder;

import com.iothouse.framework.device.IEspDevice;
import com.iothouse.framework.object.IEspObjectBuilder;
//import com.iothouse.object.db.IDeviceDB;

public interface IBEspDevice extends IEspObjectBuilder
{
    IEspDevice alloc(String deviceName, long deviceId, String deviceKey, boolean isOwner, String bssid, int state,
                     int ptype, String rom_version, String latest_rom_version, long userId, long... timestamp);
    
//    IEspDevice alloc(IDeviceDB deviceDB);
}
