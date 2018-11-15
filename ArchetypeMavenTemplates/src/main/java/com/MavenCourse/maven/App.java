package com.MavenCourse.maven;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner input = new Scanner(System.in);
        System.out.println( "Please Enter a URL:: " );
        
        attachPrefixOnUrl(input.nextLine());        
        input.close();        
    }
    
    
    public static String attachPrefixOnUrl(String url) {
    	
    	CharSequence httpCharSeq = "http://";
    	CharSequence httpsCharSeq = "https://";
    	String tempUrl =StringUtils.prependIfMissing(url, httpCharSeq, httpsCharSeq);
    	System.out.println("Url Gedada:: " + tempUrl);
    	return tempUrl;
    }
}
