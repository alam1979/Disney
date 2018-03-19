package com.usa.pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.usa.util.screenShot;

public class PageObjectModel {
		
		WebDriver driver;
		public PageObjectModel( WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
		@FindBy(how = How.XPATH, using = ".//*[@id='checkInDate_display']")
		@CacheLookup
		WebElement SelectDateButton;
		public WebElement SelectDateButton() {
		return SelectDateButton;
        }

		@FindBy(how = How.XPATH, using = "//*[@id=\\\"5_16_2018\\\"]/div/span")
		@CacheLookup
		public WebElement SelectFirstDate;

		@FindBy(how = How.XPATH, using = "//*[@id=\\\"5_17_2018\\\"]/div/span")
		@CacheLookup
		public WebElement SelectSecondDate;
		
		
		
		@FindBy(how = How.XPATH, using = "//*[@id=\\\"qqForm_childCount\\\"]/button[2]/span/wdpr-icon/span")
		@CacheLookup
		public WebElement SelectFirstChild;

		@FindBy(how = How.XPATH, using = "//*[@id=\\\"partyMixSelectChildAge1\\\"]/div/div/wdpr-uiplus-select-box/ol/button/span[2]")
		@CacheLookup

		public WebElement SelectDrup;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\\\"partyMixSelectChildAge1\\\"]/div/div/wdpr-uiplus-select-box/ol/div/ul/li[7]/a/div")
		@CacheLookup
		public WebElement SelectAge12;
		
		
		
		@FindBy(how = How.XPATH, using = "//*[@id=\\\"qqForm_childCount\\\"]/button[2]/span/wdpr-icon/span")
		@CacheLookup
		public WebElement SelectSecondChild;

		@FindBy(how = How.XPATH, using = "//*[@id=\\\"partyMixSelectChildAge2\\\"]/div/div/wdpr-uiplus-select-box/ol/button/span[2]")
		@CacheLookup
		public WebElement SelectDrupDoun;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\\\"partyMixSelectChildAge2\\\"]/div/div/wdpr-uiplus-select-box/ol/div/ul/li[14]/a/div/span")
		@CacheLookup
		public WebElement SelectAge5;
		
		

		@FindBy(how = How.XPATH, using = ".//*[@id='selectDestination']/ol/button")
		@CacheLookup
	    public WebElement ClickAllResortHotel;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\\\"selectDestination\\\"]/ol/div/ul/li[1]/a/div/span")
		@CacheLookup
		public WebElement SelectAllResortHotel;
		
		
		
		@FindBy(how = How.XPATH, using = "//*[@id=\\\"findPricesButton\\\"]")
		@CacheLookup
		public WebElement ClickFindResort;
		
		
		    public void FindHotel() throws Exception {
		    List<WebElement> AllHotel= driver.findElements(By.xpath("//a[contains(@href,'') and @class=' cardLinkOverlay lowOverlay']"));
		    System.out.println(AllHotel.size()+ "<<<<<<<<total hotel");
		    for(int i=0;i<AllHotel.size();i++) {
		    if(i>1) {
		    Thread.sleep(2000);
		    		
		    System.out.println("Selected "+i+" hotel::"+ AllHotel.get(i).getAttribute("text")+"<<<<Test Passed>>>>");
		    //HighlightEmenet.drawBorder(driver, AllHotel.get(i));
		    screenShot.captureScreenShot(driver, "Room Selection");
		    AllHotel.get(i).click();
		    break;	
		    }}
		    Thread.sleep(2500);
		    System.out.println("<<<<Searching unavaiable room");
		    	
		    // This line for find the unavailable room
		    if(driver.findElements(By.xpath(".//*[@class='priceUnavailable unavailable']")).size()>0) {
		    System.out.println("Unavailable room number =" + driver.findElements(By.xpath(".//*[@class='priceUnavailable unavailable']")).size());
		    screenShot.captureScreenShot(driver, "unavailable room");
		    }
		    else {
		    System.out.println("No unavailable room ");
		    
		    }}

			@FindBy(how = How.XPATH, using = "//*[@id=\\\"packageTicketNumberOfDaysid-base\\\"]/div/span[2]/div")
			@CacheLookup
			public WebElement UpgradeTicket;

			@FindBy(how = How.XPATH, using = "//*[@id=\\\"packageTicketOptionsid-base\\\"]/div/span[2]/div")
			@CacheLookup
			public WebElement UpdateParkHopper;

			@FindBy(how = How.XPATH, using = "//*[@id=\\\"vacationOfferEditGround\\\"]/a/span/span")
			@CacheLookup
			public WebElement ClickGroundTransport;
			
			
			
			@FindBy(how = How.XPATH, using = "//*[@id=\\\"doneButton\\\"]/span/span/span")
			@CacheLookup
			public WebElement ClickNextnoneedselect;

			@FindBy(how = How.XPATH, using = "//*[@id=\\\"doneButton\\\"]/span/span/span")
			@CacheLookup
	        public WebElement Clickdonebutton;
			
			@FindBy(how = How.XPATH, using = "//*[@id=\\\"removeButtonvacationoffer-tickets\\\"]/div")
			@CacheLookup
			public WebElement RemoveCart1;
			
			
			
			@FindBy(how = How.XPATH, using = "//*[@id=\\\"removeButtonvacationoffer-room\\\"]/div")
			@CacheLookup
			public WebElement RemoveCart2;

			@FindBy(how = How.XPATH, using = "//*[@id=\\\"openDialogvacationoffer\\\"]/div")
			@CacheLookup
			public WebElement RemoveCart3;
		   }


