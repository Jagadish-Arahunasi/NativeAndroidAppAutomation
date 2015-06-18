package com.test.wechat.testcases;

import org.testng.annotations.Test;

import com.test.wechat.config.config;
import com.test.wechat.pages.HomePage;

public class TestHomePageComponents_001 extends config{
	HomePage homepage;
	@Test(description="",priority=01)
	public void navigateToHomepage (){
	
		homepage = new HomePage(driver);
		System.out.println("Navigated to Home page successfully");
	}
	
}
