package com.test.wechat.pages;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;

import com.test.wechat.library.customFunc;

public class ContactsPage {
	private final AndroidDriver driver;
	public ContactsPage(AndroidDriver driver) {

		this.driver = driver;

		 // Check that we're on the right page- Page.

		if (!(customFunc.isElementPresent(By.name(
"Group Chats"),
				
				driver))) {
			 // If not throw IllegalStateException
			throw new IllegalStateException("This is not the Contacts Page");
		}
}
}
