package com.iothouse.framework.command.device.common;

import com.iothouse.framework.command.IEspCommandInternet;
import com.iothouse.framework.command.device.IEspCommandActivated;
//import com.iothouse.group.IEspGroup;


public interface IEspCommandDeviceSynchronizeInternet extends IEspCommandActivated, IEspCommandInternet
{
    static final String URL = "https://iot.espressif.cn/v1/user/devices/?list_by_group=true&query_devices_mesh=true";
    
    static final String Last_Active = "last_active";
    
    static final String Activated_At = "activated_at";
    
    static final String Devices = "devices";
    
    static final String Is_Owner_Key = "is_owner_key";
    
    static final String Device_Groups = "deviceGroups";
    
    /**
     * synchronize the user's device from the Server
     * 
     * @return the group(which contains device list) list of the user
     */
//    List<IEspGroup> doCommandGroupSynchronizeInternet(String userKey);
    
    /**
     * synchronize the user's device from the Server
     * 
     * @return the device list of the user
     */
//    List<IEspDevice> doCommandDeviceSynchronizeInternet(String userKey);
}
