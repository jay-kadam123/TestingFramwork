package web.demoblaze.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import web.demoblaze.testbase.TestBase;

public class TestUtils extends TestBase{

	
	public void alertdismiss()
	{
	    try {
	    	
	    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2000));
	      Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        alert.dismiss();
	    } 
	    catch (NoAlertPresentException e)
	    {
	        System.out.println("No alert present: " + e.getMessage());
	    }
	}
	
	public void alertaccept()
	{
		try {
			WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(2000));
			Alert alert = waits.until(ExpectedConditions.alertIsPresent());
			alert.accept();
		}
		catch(NoAlertPresentException a)
		{
			System.out.println("No alert present: " + a.getMessage());
		}
	}
	
	public void waits()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
	}
	
	
	public void Scrolldown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 3000)");
		
	}
	
	//to get date and time
	public String dateTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
	
	
}
