package  com.Vtiger.MyCampaigns.generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplements extends  Baseclass implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg) {
		// TODO Auto-generated method stub
		String result = arg.getName();
		TakesScreenshot t=(TakesScreenshot) driver;
		File source =t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/"+result+".png");
		try {
			FileUtils.copyFile(source, dest);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
}

