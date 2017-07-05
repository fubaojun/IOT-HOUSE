package com.fuzi.bj.iothouse.device.builder;

import com.fuzi.bj.iothouse.device.IEspDevice;
import com.fuzi.bj.iothouse.object.IEspObjectBuilder;
//import com.fuzi.bj.iothouse.object.db.IDeviceDB;

public interface IBEspDevice extends IEspObjectBuilder
{
    IEspDevice alloc(String deviceName, long deviceId, String deviceKey, boolean isOwner, String bssid, int state,
                     int ptype, String rom_version, String latest_rom_version, long userId, long... timestamp);
    
//    IEspDevice alloc(IDeviceDB deviceDB);
}
