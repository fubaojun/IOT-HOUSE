package com.fuzi.bj.iothouse.type.net;

import com.fuzi.bj.iothouse.object.IEspObject;

import org.apache.http.NameValuePair;

public class HeaderPair implements NameValuePair, IEspObject
{
    private String mName;
    
    private String mValue;
    
    public HeaderPair(String name, String value)
    {
        mName = name;
        mValue = value;
    }
    
    @Override
    public String getName()
    {
        return mName;
    }
    
    @Override
    public String getValue()
    {
        return mValue;
    }
    
    @Override
    public String toString()
    {
        return "[name=" + mName + ", value=" + mValue + "]";
    }
    
}
