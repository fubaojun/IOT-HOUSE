package com.fuzi.bj.iothouse.base.net.rest2;

import org.apache.http.entity.StringEntity;

import java.io.UnsupportedEncodingException;

class EspStringEntity extends StringEntity
{
    
    EspStringEntity(final String s, String charset)
        throws UnsupportedEncodingException
    {
        super(s, charset);
    }
    
    EspStringEntity(final String s)
        throws UnsupportedEncodingException
    {
        this(s, "ISO-8859-1");
    }
    
    public byte[] getContentBytes()
    {
        return this.content;
    }
}
