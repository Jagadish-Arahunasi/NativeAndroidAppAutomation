package com.test.wechat.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.wechat.config.config;
import com.test.wechat.library.customFunc;
import com.test.wechat.pages.ContactsPage;
import com.test.wechat.pages.HomePage;

public class TestHomePageComponents_001 extends config{
	HomePage homepage;
	ContactsPage contacts;
	@Test(description="",priority=01)
	public void navigateToHomepage (){
	
		homepage = new HomePage(driver);
		System.out.println("Navigated to Home page successfully");
		
		Assert.assertTrue(customFunc.isElementPresent(By.id("android:id/text1"), driver),"We chat title is not present");
		System.out.println("We Chat title is present");
		try{
		driver.findElementByAccessibilityId("Search");
		System.out.println("We Chat search is present");
		}
		
		catch(NoSuchElementException e){
			System.out.println("We Chat search is not present");
		}
	
		Assert.assertTrue(customFunc.isElementPresent(By.id("com.tencent.mm:id/cd"), driver));
		System.out.println("We Chat Plus icon is present");
		
		Assert.assertTrue(customFunc.isElementPresent(By.className("android.widget.LinearLayout"), driver));
		System.out.println("We Chat Add profile photo section is present");
		
		Assert.assertTrue(customFunc.isElementPresent(By.id("com.tencent.mm:id/a0n"), driver));
		System.out.println("We Chat contact chats are present");
		
	}
	
	@Test (description="click on contacts",priority=02)
	public void clickOnContacts (){

		contacts= homepage.clickOnContacts(driver);
	}
	
	@Test(description="Scroll to a particular Contact and click on the contact",priority=04)
	public void navigateToContactandClick (){
		driver.scrollTo("Sunita");
		driver.findElement(By.name("sunita arahunasi")).click();
		System.out.println("Successfully clicked on Sunita");
	}
	
	@Test(description="",priority=05)
	public void clickOnMessage(){
		
		driver.findElement(By.name("Message")).click();
		System.out.println("Successfully clicked on Message ");
	}
	@Test(description="",priority=06)
	public void clickOnTextBox(){
		
		driver.findElement(By.id("com.tencent.mm:id/r2")).click();
		System.out.println("Successfully clicked on Message TextBox ");
	}
	
	@Test(description="",priority=07)
	public void TypeOnTextBox(){
		
		driver.findElement(By.id("com.tencent.mm:id/r2")).sendKeys("Hi Kurri, it is a test message.....");
		System.out.println("Successfully enterd Message in TextBox ");
	}
	
	@Test(description="",priority=8)
	public void clickOnSendButton(){
		
		driver.findElement(By.name("Send")).click();
		System.out.println("Successfully clicked Send Button ");
	}
	
}
