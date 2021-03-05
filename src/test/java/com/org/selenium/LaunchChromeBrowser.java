package com.org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TOSHIBA\\Downloads\\vishalmavenproject\\src\\test\\resources\\com\\org\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome brower

		driver.get("https://www.youtube.com/watch?v=cu_5BFfYHCA&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=2");

		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		// validatin point
		
		if (title.equals("How to launch Chrome and Firefox (GeckoDriver) Browsers - Selenium WebDriver Session 2 - YouTube"
))
		{
			System.out.println("correct titile");
		}
		
		else {
			
			System.out.println("incorrect title0");
		}
		
		driver.quit();
	}
	
	
	

}
