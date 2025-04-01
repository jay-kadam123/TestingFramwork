package web.demoblaze.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.demoblaze.testbase.TestBase;

public class RegisterPage extends TestBase{
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@class='close'])[2]")
	private WebElement close_button;

	@FindBy(xpath="//a[@id=\"signin2\"]")
	private WebElement Signup_button;
	
	@FindBy(xpath="//input[@id=\"sign-username\"]")
	private WebElement Username_textbar;
	
	@FindBy(xpath="//input[@id=\"sign-password\"]")
	private WebElement password_textbar;

	@FindBy(xpath="//button[@onclick=\"register()\"]")
	private WebElement register_button;
	
	
	public void clickonclose_button()
	{
		close_button.click();
	}
	
	public void clickonsignupbutton()
	{
		Signup_button.click();
	}
	
	public void clearusernamefiled()
	{
		Username_textbar.clear();
	}
	
	public void clearPasswordfiled()
	{
		password_textbar.clear();
	}
	
	public void enterusername(String Username )
	{
		Username_textbar.sendKeys(Username);
	}
	
	public void enterpassword(String password)
	{
		password_textbar.sendKeys(password);
	}
	
	public void clickonregisterbutton()
	{
		register_button.click();
	}
	
	
}
