package com.fuzi.bj.iothouse.command.device.common;

import com.fuzi.bj.iothouse.command.IEspCommandLocal;
import com.fuzi.bj.iothouse.command.device.IEspCommandActivated;
import com.fuzi.bj.iothouse.command.device.IEspCommandUnactivated;
import com.fuzi.bj.iothouse.type.net.IOTAddress;

import java.util.List;

public interface IEspCommandDeviceDiscoverLocal extends IEspCommandUnactivated, IEspCommandActivated, IEspCommandLocal
{
    /**
     * discover the @see IOTAddress in the same AP
     * @return the list of IOTAddress
     */
    List<IOTAddress> doCommandDeviceDiscoverLocal();
}
