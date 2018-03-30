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


    public class PageObjectClass  {
    WebDriver driver;
    public PageObjectClass(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver,this);
	}
    @FindBy(how = How.XPATH, using = ".//*[@id='checkInDate_display']")
    @CacheLookup
    WebElement SelectDateButton;
    public WebElement SelectDateButton() {
    return SelectDateButton;
	}
	@FindBy(how = How.XPATH, using = "//*[@id='5_16_2018']/div/span")
    @CacheLookup
    WebElement SelectFirstDate;
    public WebElement SelectFirstDate() {
    return SelectFirstDate;
    }
    @FindBy(how = How.XPATH, using = "//*[@id=\"5_18_2018\"]/div/span")
    @CacheLookup
    WebElement SelectSecondDate;
    public WebElement SelectSecondDate() {
    return SelectSecondDate;
    }
    @FindBy(how = How.XPATH, using = ".//*[@id='qqForm_adultCount']/button[1]")
    @CacheLookup
    WebElement SelectFirstAdult;
    public WebElement SelectFirstAdult() {
    return SelectFirstAdult;
    }
    @FindBy(how = How.XPATH, using = ".//*[@id='qqForm_adultCount']/button[2]")
    @CacheLookup
    WebElement SelectSecondAdult;
    public WebElement SelectSecondAdult() {
    return SelectSecondAdult;
    }
    @FindBy(how = How.XPATH, using = "//*[@id='qqForm_childCount']/button[2]/span/wdpr-icon/span")
    @CacheLookup
    WebElement SelectFirstChild;
    public WebElement SelectFirstChild() {
    return SelectFirstChild;
    }
    @FindBy(how = How.XPATH, using = "//*[@id='partyMixSelectChildAge1']/div/div/wdpr-uiplus-select-box/ol/button/span[2]")
    @CacheLookup
    WebElement SelectDrup;
    public WebElement SelectDrup() {
    return SelectDrup;
    }
    @FindBy(how = How.XPATH, using = "//*[@id='partyMixSelectChildAge1']/div/div/wdpr-uiplus-select-box/ol/div/ul/li[7]/a/div")
    @CacheLookup
    WebElement SelectFirstChildAge;
    public WebElement SelectFirstChildAge() {
    return SelectFirstChildAge;
    }
    @FindBy(how = How.XPATH, using = "//*[@id='qqForm_childCount']/button[2]/span/wdpr-icon/span")
    @CacheLookup
    WebElement SelectSecondChild;
    public WebElement SelectSecondChild() {
    return SelectSecondChild;
    }
    @FindBy(how = How.XPATH, using = "//*[@id='partyMixSelectChildAge2']/div/div/wdpr-uiplus-select-box/ol/button/span[2]")
    @CacheLookup
    WebElement SelectDrup2;
    public WebElement SelectDrup2() {
    return SelectDrup2;
    }
    @FindBy(how = How.XPATH, using = "//*[@id='partyMixSelectChildAge2']/div/div/wdpr-uiplus-select-box/ol/div/ul/li[14]/a/div/span")
    @CacheLookup
    WebElement SelectSecondChildAge;
    public WebElement SelectSecondChildAge() {
    return SelectSecondChildAge;
    }
    @FindBy(how = How.XPATH, using = ".//*[@id='selectDestination']/ol/button")
    @CacheLookup
    WebElement SelectAllResortHotels;
    public WebElement SelectAllResortHotels() {
    return SelectAllResortHotels;
    }
    @FindBy(how = How.XPATH, using = "//*[@id='selectDestination']/ol/div/ul/li[1]/a/div/span")
    @CacheLookup
    WebElement SelectAllresortButton;
    public WebElement SelectAllresortButton() {
    return SelectAllresortButton;
    }
    @FindBy(how = How.XPATH, using = "//*[@id='findPricesButton']")
    @CacheLookup
    WebElement SelectFindResort;
    public WebElement SelectFindResort() {
    return SelectFindResort;
    }
    WebElement FindThirdResort;
    public WebElement FindThirdResort() {
    List<WebElement> AllHotel= driver.findElements(By.xpath("//a[contains(@href,'') and @class=' cardLinkOverlay lowOverlay']"));
    System.out.println(AllHotel.size()+ "<<<<<<<<total hotel>>>>>>>>>>>");
    for(int i=0;i<AllHotel.size();i++) {
    if(i>1) {
   //Thread.sleep(2000);
    System.out.println("Selected "+i+" hotel::"+ AllHotel.get(i).getAttribute("text")+"<<<<Test Passed>>>>");
    AllHotel.get(i).click();
    break; }}
	return FindThirdResort;
    }
    WebElement FindunavailableRoom;
    public WebElement FindunavailableRoom() throws Exception {
    Thread.sleep(2500);
    // This condition for find the unavailable room
    System.out.println("<<<<<<<Searching unavailable room>>>>>>>>");
    if(driver.findElements(By.xpath(".//*[@class='priceUnavailable unavailable']")).size()>0) {
    System.out.println("Unavailable room number =" + driver.findElements(By.xpath(".//*[@class='priceUnavailable unavailable']")).size());
    screenShot.captureScreenShot(driver, "unavailable room"); }
    else {
    System.out.println(">>>>>>>>>>No unavailable room<<<<<<<<<<< ");
    }
	return FindunavailableRoom;
	}
    WebElement FindavailableRoom;
    public WebElement FindavailableRoom() throws InterruptedException{
    List<WebElement> AllRoom= driver.findElements(By.xpath(".//span[text()='Select']"));
    System.out.println(AllRoom.size()+ "<<<<<<<<Total Available Room<<<<<<<<<<");
    for(int i=0;i<AllRoom.size();i++) {
    if(AllRoom.size()>0) {
    Thread.sleep(3000);
    System.out.println(driver.findElement(By.xpath(".//*[@class='roomsDetails']/ul/li/div[2]/h3")).getText()+ "<<<<< Selected available Room && Room Type");
    AllRoom.get(i).click();
    break;   }}
    Thread.sleep(2000);
    System.out.println(">>>>>>>>>>Congratulations finding room<<<<<<<<<<< ");
	return FindavailableRoom;
    }
    @FindBy(how = How.XPATH, using = ".//*[@id='packageTicketNumberOfDaysid-base']/div/span[2]/div")
    @CacheLookup
    WebElement UpdateTicket;
    public WebElement UpdateTicket() {
    return UpdateTicket;
    }
    @FindBy(how = How.XPATH, using = ".//*[@id='packageTicketOptionsid-base']/div/span[2]/div")
    @CacheLookup
    WebElement UpdateParkHopper;
    public WebElement UpdateParkHopper() {
    return UpdateParkHopper;
    }
    @FindBy(how = How.XPATH, using = "//*[@id=\"continueButton\"]")
    @CacheLookup
    WebElement ClickContnueButton;
    public WebElement ClickContnueButton() {
    return ClickContnueButton;
    }
    @FindBy(how = How.XPATH, using = "//*[@id=\"continueButton\"]")
    @CacheLookup
    WebElement ClickAgainContnueButton;
    public WebElement ClickAgainContnueButton() {
    return ClickAgainContnueButton;
    }
    @FindBy(how = How.XPATH, using = ".//span[text()='Add Ground']")
    @CacheLookup
    WebElement ClickGroundTransportation;
    public WebElement ClickGroundTransportation() {
    return ClickGroundTransportation;
    }
    @FindBy(how = How.XPATH, using = ".//*[@id='doneButton']")
    @CacheLookup
    WebElement ClickNextButton;
    public WebElement ClickNextButton() {
    return ClickNextButton;
    }
    @FindBy(how = How.XPATH, using = ".//*[@id='doneButton']")
    @CacheLookup
    WebElement ClickDoneButton;
    public WebElement ClickDoneButton() {
    return ClickDoneButton;
    }
    WebElement VerifyComplimentary;
    public WebElement VerifyComplimentary() {
    System.out.println(driver.findElement(By.xpath("//*[@id=\"vacationOfferContainer\"]/table/tbody/tr[8]/td[3]/span")).getText()+">>>>>>>>Complimentary<<<<<<<<");	
    return VerifyComplimentary;
    }
    WebElement TakeScreenShot;
    public WebElement TakeScreenShot() throws Exception {
    screenShot.captureScreenShot(driver,"Ground Transportation line\r\n" + "Take a screenshot");
    System.out.println(">>>>>>>>>Take Screenshort Ground Transportation<<<<<<<<<");	
    return TakeScreenShot;
    }
    @FindBy(how = How.XPATH, using = "//*[@id=\"openDialogvacationoffer\"]/div")
    @CacheLookup
    WebElement RemoveCartClick;
    public WebElement RemoveCartClick() {
    return RemoveCartClick;
    }
    @FindBy(how = How.XPATH, using = "//*[@id=\"removeButtonvacationoffer\"]/span/span")
    @CacheLookup
    WebElement FinalRemoveCartClick;
    public WebElement FinalRemoveCartClick() {
    return FinalRemoveCartClick;
    }
    WebElement TakeScreenShotAgain;
    public WebElement TakeScreenShotAgain() throws Exception {
    screenShot.captureScreenShot(driver,"Empty Cart\r\n" + "Take a screenshot");
    System.out.println(">>>>>>>>>TakeScreen short Empty cart<<<<<<<<<");
    return TakeScreenShotAgain;
    }}