package com.adactin.runner;

import org.junit.AfterClass;


import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sangeeth priyan R\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
glue = "com.adactin.stepdefinition",plugin = {"pretty","json:Report/Cucumber_Json_Report.json",
		"html:Report/Cucumber_Html_Report.html"},
tags = "@sangee1"
			//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class AdactinRunner1_Demo extends BaseClass {
	
	
public static WebDriver driver;


	
	@BeforeClass
	public static void Browser() {
	browser("edge");

	}
	
	
	@AfterClass
	public static void End() {
		close();
	}
}
