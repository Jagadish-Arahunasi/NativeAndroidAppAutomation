package com.test.wechat.config;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.File;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class config {
	public static AndroidDriver driver;
	public static String aPackage = "com.tencent.mm";
	public static String aActivity = "com.tencent.mm.ui.LauncherUI";

	// TODO Auto-generated method stub
	@BeforeTest
	public void configure() throws Exception {

		DesiredCapabilities capabilitiesAndroid = new DesiredCapabilities();
		/*
		 * capabilitiesAndroid.setCapability("browserName", "Chrome");
		 * capabilitiesAndroid.setCapability("device", "Android");
		 * capabilitiesAndroid.setCapability("deviceName", "Android");
		 * capabilitiesAndroid.setCapability("platformName", "Android")
		 * 
		 * "com.android.chrome.Main");
		 */
	//	capabilitiesAndroid.setCapability("automationName", "Selendroid");
		capabilitiesAndroid.setCapability("browserName", "");
		capabilitiesAndroid.setCapability("platformName", "Android");
		capabilitiesAndroid.setCapability("deviceName", "Android");
		capabilitiesAndroid.setCapability("appPackage", aPackage);
		capabilitiesAndroid.setCapability("appActivity", aActivity);
		// Launch the Application
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),
				capabilitiesAndroid);
		System.out.println("Launched Application");
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
	}

	@AfterTest
	public void teardown() {
		driver.quit();

	}

}
