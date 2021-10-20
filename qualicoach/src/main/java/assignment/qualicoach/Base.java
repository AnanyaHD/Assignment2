package assignment.qualicoach;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class Base 
{
public WebDriver driver;
	
	public WebDriver DriverInit() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Selenium java\\chromedriver.exe");
	     WebDriver  driver=new ChromeDriver();
		driver.get("https://test.qualicoach.org");
		driver.manage().window().maximize();
		return driver;
	}
	
	public void DriverClose() {
		driver.close();
	}
}
