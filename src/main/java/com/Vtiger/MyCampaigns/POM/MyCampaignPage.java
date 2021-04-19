package com.Vtiger.MyCampaigns.POM;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	 
	public class MyCampaignPage {
		
		WebDriver driver;
		
		public MyCampaignPage(WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver,this);
		}
		 
		@FindBy(xpath="//input[@id='122']")
		private WebElement Checkbox;
		
		public WebElement getCheckbox() {
			return Checkbox;
			}
		
		@FindBy(xpath="input[@value='Mass Edit']")
		private WebElement MassEditbtn;
		
		public WebElement MassEditbtn() {
			return MassEditbtn;
			}
		@FindBy(xpath="input[@name='campaignname']")
		private WebElement campaignnametbx;
		
		public WebElement campaignnametbx() {
			return campaignnametbx;
			}

		@FindBy(xpath="//select[@id='fcol0']")
		private WebElement Advancesearch;

		public WebElement Advancesearch() {
			return Advancesearch;
		}
		
		@FindBy(xpath="//select[@id='fcol0']")
		private WebElement DDL;

		public WebElement getInDDL() {
			return DDL;
		}
		
		 
			
		}  
		//href="index.php?module=SMSNotifier&action=index"
		////a[@href="javascript:;"]
		////select[@id="fcol0"]
		////select[@id="fcol0"]/optgroup[1]/option[1]
		
	



