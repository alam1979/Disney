package com.usa.stefdefination;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.usa.pageobjectmodel.PageObjectModel;


   public class StepDefination  {
	WebDriver driver;	
	@BeforeTest
	public void CallObject() {
    System.setProperty ("webdriver.chrome.driver","./DriverBrowsers/chromedriver.exe" );
    WebDriver driver = new ChromeDriver();
    //WebDriver driver = new FirefoxDriver();
    driver.get("https://disneyworld.disney.go.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
    } 
    
    @Test
    public void CallPageObjectModel() {
    PageObjectModel CallObject = new PageObjectModel(driver);
    CallObject.SelectDateButton().click();
    }}



