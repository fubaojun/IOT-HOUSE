package com.fuzi.bj.iothouse.command.device.common;

import com.fuzi.bj.iothouse.base.api.EspBaseApiUtil;
import com.fuzi.bj.iothouse.type.net.IOTAddress;

//import org.apache.log4j.Logger;

import java.net.InetAddress;
import java.util.List;

public class EspCommandDeviceDiscoverLocal implements IEspCommandDeviceDiscoverLocal
{
//    private final static Logger log = Logger.getLogger(EspCommandDeviceDiscoverLocal.class);
    
    @Override
    public List<IOTAddress> doCommandDeviceDiscoverLocal()
    {
        List<IOTAddress> result = EspBaseApiUtil.discoverDevices();
//        log.debug(Thread.currentThread().toString() + "##doCommandDeviceDiscoverLocal(): " + result);
        return result;
    }
    
    @Override
    public String getLocalUrl(InetAddress inetAddress)
    {
        throw new RuntimeException("EspCommandDeviceSleepRebootLocal don't support getLocalUrl");
    }
    
}
