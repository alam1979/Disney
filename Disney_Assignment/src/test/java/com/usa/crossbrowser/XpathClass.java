package com.usa.crossbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class XpathClass {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./DriverBrowsers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		
		//select.selectByValue("ca");
		// Step 4:) Select option 'Europe' (Use selectByIndex)
	
		//select.selectByVisibleText("Europe");
		
		
		   List<WebElement> AllRoom= driver.findElements(By.xpath("//a[@class='other-project-link']"));
		    System.out.println(AllRoom.size()+ "<<<<<<<<Total Available Room<<<<<<<<<<");
		    for(int i=0;i<AllRoom.size();i++) {
		    if(AllRoom.size()>4) {
		   // System.out.println(driver.findElement(By.xpath(".//*[@class='roomsDetails']/ul/li/div[2]/h3")).getText()+ "<<<<< Selected available Room && Room Type");
		    AllRoom.get(i).click();
		    break;   }}
		
		
		
	}

}
