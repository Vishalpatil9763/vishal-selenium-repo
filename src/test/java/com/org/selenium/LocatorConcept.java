package com.org.selenium;

import org.apache.log4j.helpers.QuietWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TOSHIBA\\Downloads\\vishalmavenproject\\src\\test\\resources\\com\\org\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome brower
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&ref_%3Dnav_em_hd_clc_signin");

		WebElement emailElement = driver.findElement(By.xpath("//input[@id='ap_email'  ]"));

		emailElement.sendKeys("7350167620");

		WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));

		continueButton.click();

		

	}

}
