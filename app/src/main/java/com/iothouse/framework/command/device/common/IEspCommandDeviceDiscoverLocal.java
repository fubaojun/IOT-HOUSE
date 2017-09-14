package com.iothouse.framework.command.device.common;

import com.iothouse.framework.command.IEspCommandLocal;
import com.iothouse.framework.command.device.IEspCommandActivated;
import com.iothouse.framework.command.device.IEspCommandUnactivated;
import com.iothouse.framework.type.net.IOTAddress;

import java.util.List;

public interface IEspCommandDeviceDiscoverLocal extends IEspCommandUnactivated, IEspCommandActivated, IEspCommandLocal
{
    /**
     * discover the @see IOTAddress in the same AP
     * @return the list of IOTAddress
     */
    List<IOTAddress> doCommandDeviceDiscoverLocal();
}
