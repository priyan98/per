package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProvider {
	public static WebDriver dr;

	public String[][] value = { { "sangeeth98", "manamadurai" }, { "manamadurai", "sangeeth98" },
			{ "manamadurai45", "sangee" }, };

	@org.testng.annotations.DataProvider(name = "LogIn")
	public String[][] TestDataProvider() {
		return value;
	}

	@Test(dataProvider = "LogIn")
	public void login(String MailId, String Password) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sangeeth priyan R\\eclipse-workspace\\Cucumber\\Driver\\msedgedriver110.63.exe");
		WebDriver dr = new EdgeDriver();
		dr.get("https://adactinhotelapp.com/");
		dr.manage().window().maximize();

		dr.findElement(By.id("username")).sendKeys(MailId);
		dr.findElement(By.id("password")).sendKeys(Password);
		dr.findElement(By.name("login")).click();

	}

}
