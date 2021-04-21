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
	public class TestCase_13_WorldClockPopUP extends Baseclass{
		
		@Test
		public void MyCampaigns_ShowWorldClock() throws EncryptedDocumentException, InvalidFormatException, IOException {
			HomePage hp=new HomePage(driver);
			//Navigating to the application
			driver.navigate().to("url");
			
			//Hovering and clicking on MoreDD
			WebElement mdd= hp.getMoreDropDown();
			wdu.movetoelement(driver, mdd);
			
			//clicking on Campaigns Module Link
			hp.getCampaigns().click();
			
			//navigate to World Clock Icon and click
			WebElement wci= hp.getWorldClockIcon();
			wdu.movetoelement(driver, wci);
			hp.getWorldClockIcon().click();
			 
			MyCampaignPage cp = new MyCampaignPage(driver);
			//Display the WorldClock PopUp
			cp.WorldClockLink().click();
			 
		}
		
	}
	 
	 





//world Clock Link
//img[@src="themes/softed/images/btnL3Clock.gif"]
//*[@id="wclock"]/table[2]/tbody/tr/td

//popup of world clock
//td[@nowrap="nowrap"]