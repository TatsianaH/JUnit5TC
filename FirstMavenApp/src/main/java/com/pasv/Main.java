package com.pasv;

import org.apache.commons.lang3.StringUtils;

public class Main 
{
    public static void main( String... args )
    {
    	String str = "1.0";
    	str = StringUtils.rightPad(str, 5, "0");
        System.out.println(str);
    }
}
