package com.test.wechat.library;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class customFunc {

	
	/**
	 * Method Name: isElementPresent Description:Method to verify the Element
	 * 
	 * @param by
	 *            :Element locator
	 * @param driver
	 *            :AndroidDriver
	 * @return true: if element is present, false: if element is not present
	 */
	public static boolean isElementPresent(By by, AndroidDriver driver) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;

		}
	}
	
	
	/**
	 * Method Name: getRootDir Description: Method to get Root directory
	 * 
	 * @return :rootDir
	 */
	public static String getRootDir() {
		File path = new File("");
		String absPath = path.getAbsolutePath();
		File dir = new File(absPath);
		String rootDir = dir.getParent();
		return rootDir;

		// return absPath;
	}
	
	/**
	 * MethodName:generateTimeStamp Description: This method generates timestamp
	 * 
	 * @return newDate
	 */
	public static String generateTimeStamp() {

		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		SimpleDateFormat stringDate = new SimpleDateFormat("ddMMyyhhmmss");

		String newDate = stringDate.format(date);

		return newDate;

	}
	/**
	 * MethodName:compareNumericValues
	 * 
	 * Description: This method compares the 2 values
	 * 
	 * @param int value1
	 * @param int value2
	 */
	public static boolean compareNumericValues(float value1, float value2)
			throws Exception {

		boolean match;

		if (value1 > value2) {

			match = true;
		} else {
			match = false;
		}

		return match;

	}
	
	/**
	 * This element verifies element is displayed or not
	 * 
	 * @param ele
	 * @param driver
	 * @return
	 * @throws Exception
	 */
	public static boolean isElementVisible(By ele, AndroidDriver driver)
			throws Exception {
		try {
			driver.findElement(ele).isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	/**
	 * This Function selects the radio button iFrame.
	 * 
	 * @param driver
	 *            : AndroidDriver instance.
	 */

	public static void selectRaidoButton(AndroidDriver driver, By by, String eleName) {
		// Initialize WebElement
		WebElement ele = driver.findElement(by);

		try {
			if (!ele.isSelected()) {
				ele.click();
			}
			System.out.println("Successfully selected the raido button '" + eleName + "'");
		}

		catch (NoSuchElementException e) {

			System.out.println("Exception element not present : " + eleName);
		}

	}
	
	

}