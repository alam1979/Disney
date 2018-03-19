package com.usa.stefdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectClass {
	
	WebDriver driver;
	
	By homePageloginBtn = By.xpath(".//*[@id='checkInDate_display']");
	
    public PageObjectClass(WebDriver driver) {
    this.driver = driver;
    }


	public By getHomePageloginBtn() {
		return homePageloginBtn;
	}
}