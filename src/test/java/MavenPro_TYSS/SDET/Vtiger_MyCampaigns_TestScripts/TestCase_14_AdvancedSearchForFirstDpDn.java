package MavenPro_TYSS.SDET.Vtiger_MyCampaigns_TestScripts;

	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;

	import java.io.IOException;
	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.openqa.selenium.WebElement;
	import com.Vtiger.MyCampaigns.POM.HomePage;
	import com.Vtiger.MyCampaigns.POM.MyCampaignPage;
	import com.Vtiger.MyCampaigns.generics.Baseclass;
	 
	@Listeners(com.Vtiger.MyCampaigns.generics.ListenerImplements.class)
	
	public class TestCase_14_AdvancedSearchForFirstDpDn extends Baseclass{
		
		@Test
		public void MyCampaigns_AdvancedSearchForFirstDpDn() throws EncryptedDocumentException, InvalidFormatException, IOException {
			HomePage hp=new HomePage(driver);
			//Navigating to the application
			driver.navigate().to("url");
			
			//Hovering and clicking on MoreDD
			WebElement mdd= hp.getMoreDropDown();
			wdu.movetoelement(driver, mdd);
			
			//clicking on Campaigns Module Link
			hp.getCampaigns().click();
			
			//Navigate to the Advanced Search option link
			WebElement Asp= hp.getAdvancesearch();
			wdu.movetoelement(driver, Asp);
			 hp.getAdvancesearch().click();
			 
			 MyCampaignPage cp = new MyCampaignPage(driver);
			 cp.getInDDL().click();

			wdu.selectdropdown(cp.getInDDL(),cp.getInDDL1());
			 
		}
		
	}
	 
	 





 
