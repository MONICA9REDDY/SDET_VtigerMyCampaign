package com.Vtiger.MyCampaigns.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.MyCampaigns.generics.WebDriverUtility;
public class HomePage {
	WebDriver driver;
	public  WebDriverUtility w = new WebDriverUtility();
	
	@FindBy(xpath ="img[@src='themes/softed/images/menuDnArrow.gif']")
	private WebElement MoreDropDown;
	
	public WebElement getMoreDropDown() {
		return MoreDropDown;
}
	@FindBy(xpath="//a[@name='Campaigns']")
	private WebElement Campaigns;
	
	public WebElement getCampaigns() {
		return Campaigns;
		}
	
	@FindBy(xpath ="//img[contains(@src,'user.PNG')]")
	private WebElement administrationImg;

	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;

	 
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void setLogout() {
		 w.movetoelement(driver, administrationImg);
			signOutLink.click();
		}
		 
	}
	 


