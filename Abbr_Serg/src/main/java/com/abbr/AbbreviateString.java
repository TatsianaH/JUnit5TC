package com.abbr;

import org.apache.commons.lang3.StringUtils;

public class AbbreviateString 
{
    public static void main( String[] args )
    {
        String str = "Привет всем кто живет на луне!";
        String str1 = StringUtils.abbreviate(str, 20);
        String str2 = StringUtils.abbreviate(str, 10);
    	System.out.println( str1);
    	System.out.println( str2);
    }
}
