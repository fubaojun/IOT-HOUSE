package com.fuzi.bj.iothouse.action.device.common;

//import com.fuzi.bj.iothouse.command.device.flammable.EspCommandFlammableGetStatusInternet;
//import com.fuzi.bj.iothouse.command.device.flammable.IEspCommandFlammableGetStatusInternet;
//import com.fuzi.bj.iothouse.command.device.humiture.EspCommandHumitureGetStatusInternet;
//import com.fuzi.bj.iothouse.command.device.humiture.IEspCommandHumitureGetStatusInternet;
import com.fuzi.bj.iothouse.command.device.light.EspCommandLightGetEspnowInternet;
import com.fuzi.bj.iothouse.command.device.light.EspCommandLightGetStatusInternet;
import com.fuzi.bj.iothouse.command.device.light.IEspCommandLightGetEspnowInternet;
import com.fuzi.bj.iothouse.command.device.light.IEspCommandLightGetStatusInternet;
//import com.fuzi.bj.iothouse.command.device.plug.EspCommandPlugGetStatusInternet;
//import com.fuzi.bj.iothouse.command.device.plug.IEspCommandPlugGetStatusInternet;
//import com.fuzi.bj.iothouse.command.device.plugs.EspCommandPlugsGetStatusInternet;
//import com.fuzi.bj.iothouse.command.device.plugs.IEspCommandPlugsGetStatusInternet;
//import com.fuzi.bj.iothouse.command.device.remote.EspCommandRemoteGetStatusInternet;
//import com.fuzi.bj.iothouse.command.device.remote.IEspCommandRemoteGetStatusInternet;
//import com.fuzi.bj.iothouse.command.device.voltage.EspCommandVoltageGetStatusInternet;
//import com.fuzi.bj.iothouse.command.voltage.IEspCommandVoltageGetStatusInternet;
import com.fuzi.bj.iothouse.device.IEspDevice;
//import com.fuzi.bj.iothouse.device.IEspDeviceFlammable;
//import com.fuzi.bj.iothouse.device.IEspDeviceHumiture;
import com.fuzi.bj.iothouse.device.IEspDeviceLight;
//import com.fuzi.bj.iothouse.device.IEspDevicePlug;
//import com.fuzi.bj.iothouse.device.IEspDevicePlugs;
//import com.fuzi.bj.iothouse.device.IEspDeviceVoltage;
import com.fuzi.bj.iothouse.type.device.EspDeviceType;
//import com.fuzi.bj.iothouse.type.device.status.IEspStatusEspnow;
//import com.fuzi.bj.iothouse.type.device.status.IEspStatusFlammable;
//import com.fuzi.bj.iothouse.type.device.status.IEspStatusHumiture;
import com.fuzi.bj.iothouse.type.device.status.IEspStatusLight;
//import com.fuzi.bj.iothouse.type.device.status.IEspStatusPlug;
//import com.fuzi.bj.iothouse.type.device.status.IEspStatusPlugs;
//import com.fuzi.bj.iothouse.type.device.status.IEspStatusRemote;
//import com.fuzi.bj.iothouse.type.device.status.IEspStatusVoltage;


public class EspActionDeviceGetStatusInternet implements IEspActionDeviceGetStatusInternet
{
    
    @Override
    public boolean doActionDeviceGetStatusInternet(IEspDevice device)
    {
        EspDeviceType deviceType = device.getDeviceType();
        switch (deviceType)
        {
            case FLAMMABLE:
//                return executeGetFlammableStatusInternet(device);
            case HUMITURE:
//                return executeGetHumitureStatusInternet(device);
            case VOLTAGE:
//                return executeGetVoltageStatusInternet(device);
            case LIGHT:
                return executeGetLightStatusInternet(device);
            case PLUG:
//                return executeGetPlugStatusInternet(device);
            case REMOTE:
//                return executeGetRemoteStatusInternet(device);
            case PLUGS:
//                return executeGetPlugsStatusInternet(device);
            case ROOT:
                return false;
            case NEW:
                break;
        }
        throw new IllegalArgumentException();
    }
    
//    private boolean executeGetFlammableStatusInternet(IEspDevice device)
//    {
//        boolean result = false;
//
//        IEspCommandFlammableGetStatusInternet flammalbeCommand = new EspCommandFlammableGetStatusInternet();
//        IEspStatusFlammable flammableStatus = flammalbeCommand.doCommandFlammableGetStatusInternet(device.getKey());
//        if (flammableStatus != null)
//        {
//            result = true;
//            IEspDeviceFlammable flammable = (IEspDeviceFlammable)device;
//            flammable.getStatusFlammable().setAt(flammableStatus.getAt());
//            flammable.getStatusFlammable().setX(flammableStatus.getX());
//        }
//
//        return result;
//    }
    
//    private boolean executeGetHumitureStatusInternet(IEspDevice device)
//    {
//        boolean result = false;
//
//        IEspCommandHumitureGetStatusInternet humitureCommand = new EspCommandHumitureGetStatusInternet();
//        IEspStatusHumiture humitureStatus = humitureCommand.doCommandHumitureGetStatusInternet(device.getKey());
//        if (humitureStatus != null)
//        {
//            result = true;
//            IEspDeviceHumiture humiture = (IEspDeviceHumiture)device;
//            humiture.getStatusHumiture().setAt(humitureStatus.getAt());
//            humiture.getStatusHumiture().setX(humitureStatus.getX());
//            humiture.getStatusHumiture().setY(humitureStatus.getY());
//        }
//
//        return result;
//    }
    
//    private boolean executeGetVoltageStatusInternet(IEspDevice device)
//    {
//        boolean result = false;
//
//        IEspCommandVoltageGetStatusInternet voltageCommand = new EspCommandVoltageGetStatusInternet();
//        IEspStatusVoltage voltageStatus = voltageCommand.doCommandVoltageGetStatusInternet(device.getKey());
//        if (voltageStatus != null)
//        {
//            result = true;
//            IEspDeviceVoltage voltage = (IEspDeviceVoltage)device;
//            voltage.getStatusVoltage().setAt(voltageStatus.getAt());
//            voltage.getStatusVoltage().setX(voltageStatus.getX());
//        }
//
//        return result;
//    }
    
    private boolean executeGetLightStatusInternet(IEspDevice device)
    {
        boolean result = false;
        IEspDeviceLight light = (IEspDeviceLight)device;
        
        // get rgb period white value
        IEspCommandLightGetStatusInternet lightCommand = new EspCommandLightGetStatusInternet();
        IEspStatusLight lightStatus = lightCommand.doCommandLightGetStatusInternet(device.getKey());
        if (lightStatus != null)
        {
            result = true;
            light.getStatusLight().setPeriod(lightStatus.getPeriod());
            light.getStatusLight().setRed(lightStatus.getRed());
            light.getStatusLight().setGreen(lightStatus.getGreen());
            light.getStatusLight().setBlue(lightStatus.getBlue());
            light.getStatusLight().setCWhite(lightStatus.getCWhite());
            light.getStatusLight().setWWhite(lightStatus.getWWhite());
        }
        
        // get battery value
        boolean batterySuc = false;
        IEspCommandLightGetEspnowInternet batteryCommand = new EspCommandLightGetEspnowInternet();
//        List<IEspStatusEspnow> espnowStatusList = batteryCommand.doCommandLightGetEspnowInternet(device.getKey());
//        List<IEspStatusEspnow> deviceEspnowStatusList = light.getEspnowStatusList();
//        deviceEspnowStatusList.clear();
//        if (espnowStatusList != null)
//        {
//            deviceEspnowStatusList.addAll(espnowStatusList);
//            batterySuc = true;
//        }
        
        return result && batterySuc;
    }
    
//    private boolean executeGetPlugStatusInternet(IEspDevice device)
//    {
//        boolean result = false;
//
//        IEspCommandPlugGetStatusInternet plugCommand = new EspCommandPlugGetStatusInternet();
//        IEspStatusPlug plugStatus = plugCommand.doCommandPlugGetStatusInternet(device.getKey());
//        if (plugStatus != null)
//        {
//            result = true;
//            IEspDevicePlug plug = (IEspDevicePlug)device;
//            plug.getStatusPlug().setIsOn(plugStatus.isOn());
//        }
//
//        return result;
//    }
    
//    private boolean executeGetRemoteStatusInternet(IEspDevice device)
//    {
//        boolean result = false;
//
//        IEspCommandRemoteGetStatusInternet remoteCommand = new EspCommandRemoteGetStatusInternet();
//        IEspStatusRemote remoteStatus = remoteCommand.doCommandRemoteGetStatusInternet(device.getKey());
//        if (remoteStatus != null)
//        {
//            result = true;
//            IEspDeviceRemote remote = (IEspDeviceRemote)device;
//            remote.getStatusRemote().setAddress(remoteStatus.getAddress());
//            remote.getStatusRemote().setCommand(remoteStatus.getCommand());
//            remote.getStatusRemote().setRepeat(remoteStatus.getRepeat());
//        }
//
//        return result;
//    }
    
//    private boolean executeGetPlugsStatusInternet(IEspDevice device)
//    {
//        boolean result = false;
//
//        IEspCommandPlugsGetStatusInternet plugsCommand = new EspCommandPlugsGetStatusInternet();
//        IEspStatusPlugs plugsStatus = plugsCommand.doCommandPlugsGetStatusInternet(device.getKey());
//        if (plugsStatus != null)
//        {
//            result = true;
//            IEspDevicePlugs plugs = (IEspDevicePlugs)device;
//            plugs.setStatusPlugs(plugsStatus);
//        }
//
//        return result;
//    }
}
