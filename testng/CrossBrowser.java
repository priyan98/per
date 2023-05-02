package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowser  {
	RemoteWebDriver dr;

	@Test
	@Parameters({"browser","MailId","Password"})
	public void login( String browser, String MailId, String Password) {

		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sangeeth priyan R\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
			dr = new ChromeDriver();
			

			break;

		case "edge":
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\sangeeth priyan R\\eclipse-workspace\\selenium\\Driver\\msedgedriver.exe");
			dr = new EdgeDriver();
			

			break;
		default:	
			System.err.println("Not found");
			break;
		}
		dr.get("https://adactinhotelapp.com/");
		dr.manage().window().maximize(); 
        dr.findElement(By.id("username")).sendKeys(MailId);
		dr.findElement(By.id("password")).sendKeys(Password);
		dr.findElement(By.name("login")).click();
		System.out.println(dr.getCurrentUrl());
                dr.close();

	}

}

