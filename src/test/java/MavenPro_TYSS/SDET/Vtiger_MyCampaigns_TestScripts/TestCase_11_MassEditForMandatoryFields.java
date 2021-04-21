package MavenPro_TYSS.SDET.Vtiger_MyCampaigns_TestScripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
 
import com.Vtiger.MyCampaigns.POM.HomePage;
import com.Vtiger.MyCampaigns.POM.MyCampaignPage;
import com.Vtiger.MyCampaigns.generics.Baseclass;
import com.Vtiger.MyCampaigns.generics.ExcelUtility;
@Listeners(com.Vtiger.MyCampaigns.generics.ListenerImplements.class)
public class TestCase_11_MassEditForMandatoryFields extends Baseclass{
	@Test
	public void MyCampaigns_MassEditForMandtoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException {
		HomePage hp=new HomePage(driver);
		//Navigating to the application
		driver.navigate().to("url");
		
		//Hovering and clicking on MoreDD
		WebElement mdd= hp.getMoreDropDown();
		wdu.movetoelement(driver, mdd);
		
		//clicking on Campaigns Module Link
		hp.getCampaigns().click();
		
		MyCampaignPage cp = new MyCampaignPage(driver);
		//Checkbox is to be Selected
		cp.getCheckbox().isSelected();
		//Click on MassEdit Button to open the Mass record
		cp.MassEditbtn().click();
		 //Edit for Mandatory fields
		ExcelUtility eu= new ExcelUtility();
		String CampaignName = eu.readDatafromExcel("Sheet2",1,0);
		cp.getcampaignnametbx().sendKeys(CampaignName);
		String ActualCampaigns = cp.getcampaignnametbx().getAttribute("value");
		Assert.assertEquals(ActualCampaigns, CampaignName);
		cp.getCheckbox1().isSelected();
		cp.getCalander().click();
		cp.getSelectDate().click();
		String Expectedclosedate =eu.readDatafromExcel( "Sheet2", 1,  1);
		String ActualECD = cp.getClosingdate().getAttribute("value");
		cp.getClosingdate().sendKeys(Expectedclosedate);
		Assert.assertEquals(ActualECD, Expectedclosedate);
		cp.getCheckbox2().isSelected();
	
		cp.getAssigned_To().click();
		cp.getCheckbox3().isSelected();
		//Click on save button to save the record
		cp.getSavebtn().click();
		
	}
	
}
 
//src="themes/softed/images/btnL3Calendar.gif"
///html/body/div[29]/table/tbody/tr[4]/td[5]
///html/body/div[29]/table/tbody/tr[4]/td[5]