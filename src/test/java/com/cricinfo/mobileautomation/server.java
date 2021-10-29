package com.cricinfo.mobileautomation;

import java.io.IOException;
import java.net.ServerSocket;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class server {
	
//	public static void main(String[] args) 
		public static AppiumDriverLocalService service;
		  public static AndroidDriver<AndroidElement>  driver;
		
		public AppiumDriverLocalService startServer()
		{
			//
		boolean flag=	checkIfServerIsRunnning(4723);
		if(!flag)
		{
			
			service=AppiumDriverLocalService.buildDefaultService();
			service.start();
		}
			return service;
			
		}
		
	public static boolean checkIfServerIsRunnning(int port) {
			
			boolean isServerRunning = false;
			ServerSocket serverSocket;
			try {
				serverSocket = new ServerSocket(port);
				
				serverSocket.close();
			} catch (IOException e) {
				//If control comes here, then it means that the port is in use
				isServerRunning = true;
			} finally {
				serverSocket = null;
			}
			return isServerRunning;
		}


	}
