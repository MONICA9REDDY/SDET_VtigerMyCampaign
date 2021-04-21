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
		 
		@FindBy(xpath="input[@id='122']")
		private WebElement Checkbox;
		
		public WebElement getCheckbox() {
			return Checkbox;
			}
		
		@FindBy(xpath="input[@value='Mass Edit']")
		private WebElement MassEditbtn;
		
		public WebElement MassEditbtn() {
			return MassEditbtn;
			}
		@FindBy(xpath="input[@id='campaignname_mass_edit_check']")
		private WebElement Checkbox1;
		
		public WebElement getCheckbox1() {
			return Checkbox1;
			}
		@FindBy(xpath="input[@name='closingdate_mass_edit_check']")
		private WebElement Checkbox2;
		
		public WebElement getCheckbox2() {
			return Checkbox2;
			}
		@FindBy(xpath="input[@name='closingdate']")
		private WebElement Closingdate;
		
		public WebElement getClosingdate() {
			return Closingdate;
			}
		@FindBy(xpath="img[@id='jscal_trigger_closingdate']")
		private WebElement  Calander;
		
		public WebElement getCalander() {
			return Calander;
			}
		 
		@FindBy(xpath="input[@id='assigned_user_id_mass_edit_check']")
		private WebElement Checkbox3;
		
		public WebElement getCheckbox3() {
			return Checkbox3;
			}
		
		@FindBy(xpath="/html/body/div[29]/table/tbody/tr[4]/td[5]")
		private WebElement SelectDate;
		
		public WebElement getSelectDate()  {
			return SelectDate ;
			}
		@FindBy(xpath="input[@class='crmbutton small save']")
		private WebElement Savebtn;
		
		public WebElement getSavebtn() {
			return Savebtn;
			}
		@FindBy(xpath="//select[@name='assigned_user_id']")
		private WebElement  Assigned_To;
		
		public WebElement getAssigned_To() {
			return Assigned_To;
			}
	
		@FindBy(xpath="input[@name='campaignname']")
		private WebElement campaignnametbx;
		
		public WebElement getcampaignnametbx() {
			return campaignnametbx;
			}
		
		@FindBy(xpath="td[@nowrap='nowrap']")
		private WebElement WorldClockLink ;
		
		public WebElement WorldClockLink() {
			return WorldClockLink;
			}
		
		@FindBy(xpath="//select[@id='fcol0']")
		private WebElement DDL;

		public WebElement getInDDL() {
			return DDL;
		}
		@FindBy(xpath="select[@id='fcol0']/optgroup[1]/option[1]")
		private WebElement DDL1;

		public WebElement getInDDL1() {
			return DDL1;
		}
		@FindBy(xpath="select[@id='fcol0']/optgroup[1]/option[2]")
		private WebElement DDL2;

		public WebElement getInDDL2() {
			return DDL2;
		}
		}
	 
		//href="index.php?module=SMSNotifier&action=index"
		////a[@href="javascript:;"]
	 
	
	//popup of world clock
	//td[@nowrap="nowrap"]
	//*[@id="wclock"]/table[2]/tbody/tr/td




