package web.demoblaze.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import web.demoblaze.pagelayer.CartPage;
import web.demoblaze.pagelayer.LoginPage;
import web.demoblaze.pagelayer.RegisterPage;
import web.demoblaze.utility.TestUtils;


public class TestBase {

	public static Properties props;
	public static WebDriver driver;
	protected static String dateTime;
	//get the data from file
	public static FileInputStream input;
	public static FileInputStream details;
	public static JSONObject loginUsers;
	
	//class call
	public static  LoginPage l;
	public static  TestUtils t;
	public static  RegisterPage r;
	public static   CartPage c;
	
	 public WebDriver getDriver() {  
		  return driver ;
	  }
	  
	  public String getDateTime() {
		  return dateTime;
	  }
	  
	  
	@BeforeClass
	public void setup() throws IOException
	{
		
		
		//get the data from confg file
		String PropertiesFileName=".//resources//data//config.properties";
		 input=new FileInputStream(PropertiesFileName);
		 props=new Properties();
		 props.load(input);
		 
		 WebDriverManager.chromedriver().clearResolutionCache();
		 WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get(props.getProperty("WEBURL"));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//get the data from json file
		String JsonfileName =".//resources//data//loginUsers.json";
		 details = new FileInputStream(JsonfileName);
		JSONTokener tokener = new JSONTokener(details);
		 loginUsers = new JSONObject(tokener);
		
		  l=new LoginPage();
		  t=new TestUtils();
		  r=new RegisterPage();
		c=new CartPage();   
		
		
		dateTime=t.dateTime();
	}
	
	
	@AfterClass
	public void logout()
	{
		driver.close();
	}
}
