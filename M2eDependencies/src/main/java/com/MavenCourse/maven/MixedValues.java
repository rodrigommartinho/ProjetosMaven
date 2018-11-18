package com.MavenCourse.maven;

import org.apache.commons.lang3.StringUtils;

public class MixedValues {

	public static void main(String[] args) {
		
		String mixedValues = "TestExample5";
		
		isMixedValues(mixedValues);
		
	}

	public static void isMixedValues(String mixedValues) {
		
		if (StringUtils.isMixedCase(mixedValues)) {
			System.out.println(mixedValues + " are mixed values");
		}
		System.out.println(mixedValues + " are NOT mixed values");
			
	}
	
}
