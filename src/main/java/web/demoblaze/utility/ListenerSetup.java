package web.demoblaze.utility;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import web.demoblaze.testbase.TestBase;
;

public class ListenerSetup extends TestBase implements ITestListener{
	public void onTestFailure(ITestResult result) {
		
		
		TakesScreenshot ts=((TakesScreenshot)driver);
		File file=ts.getScreenshotAs(OutputType.FILE);
		
		TestBase base=new TestBase();
	        Map<String, String> params = result.getTestContext().getCurrentXmlTest().getAllParameters();
	      
	        String imagePath = "Screenshots" + File.separator +   File.separator
	                + base.getDateTime() + File.separator + result.getTestClass().getRealClass().getSimpleName()
	                + File.separator + result.getName() + ".png";

			try {
				FileUtils.copyFile(file, new File(imagePath));
			} catch (IOException e) {
				e.printStackTrace();
			}

	    }
	

	public void onTestStart(ITestResult result) 
	{
		
	}

	public void onTestSuccess(ITestResult result) 
	{
	}

	public void onTestSkipped(ITestResult result) 
      {
    	 
	}
	
}
