package com.pos.testautomation.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import net.bytebuddy.asm.Advice.Return;

public class propertyFileReader {
	public Properties getProperty() throws IOException{
	FileInputStream fis = null;
	Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("Resources\\browser-configur.properties"));
			//properties.load(new FileInputStream("E:\\Java_Projrams\\Selenium_Programs\\Cucumebr_01\\Resources\\browser-configur.properties"));
	}catch (Exception e) {
		System.out.println("Exception :"+e);
		// TODO: handle exception
	}
	return properties;	
}}
