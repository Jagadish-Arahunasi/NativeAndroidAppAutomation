package com.test.wechat.pages;

import org.openqa.selenium.By;

import com.test.wechat.library.customFunc;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {

	private final AndroidDriver driver;
	public HomePage(AndroidDriver driver) {

		this.driver = driver;

		 // Check that we're on the right page- Page.

		if (!(customFunc.isElementPresent(By.id(
"com.tencent.mm:id/anv"),
				
				driver))) {
			 // If not throw IllegalStateException
			throw new IllegalStateException("This is not the  Page");
		}
}
}