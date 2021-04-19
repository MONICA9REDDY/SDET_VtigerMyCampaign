 package MavenPro_TYSS.SDET.Vtiger_MyCampaigns_TestScripts;


	import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import  com.Vtiger.MyCampaigns.POM.HomePage;
import com.Vtiger.MyCampaigns.POM.MyCampaignPage;
import com.Vtiger.MyCampaigns.generics.Baseclass;
import com.Vtiger.MyCampaigns.generics.ExcelUtility;
 
 
 import com.Vtiger.MyCampaigns.generics.WebDriverUtility;
 
	@Listeners(com.Vtiger.MyCampaigns.generics.ListenerImplements.class)
	 
	public class Campaign_MassEdit_tc extends Baseclass {
			static {
				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			}
			
			WebDriver driver ;
			 
			@Test
			public void Mass_Edit_CampaignTC() throws Exception {
			//Reporter.log("login",true);
			Reporter.log("MassEditCampaigns",true);
			HomePage hp=new HomePage(driver);
			//mouse hover to More dropdown
			 WebDriverUtility w=new WebDriverUtility();
			w.mouseHover(driver,hp.getMoreDropDown()); 
			w.elementisclickable(driver,hp.getCampaigns());
			
			MyCampaignPage cp = new MyCampaignPage(driver);
			cp.getCheckbox().click();
			
			ExcelUtility eu= new ExcelUtility();
			String CampaignName =eu.readDatafromExcel("Sheet2",1,0);
			//click on edit button
			cp.MassEditbtn().click();
			cp.campaignnametbx().sendKeys(CampaignName);
			String ActualCampaigns = cp.campaignnametbx().getAttribute("value");
			Assert.assertEquals(ActualCampaigns, CampaignName);
		}
				
		}


	//a[text()="Aristotal"]
	//a[text()="Manthas"]
	 




