package web.demoblaze.testlayer;

import org.testng.annotations.Test;

import web.demoblaze.testbase.TestBase;

public class B_Loginpage_Test extends TestBase{

	
	
	@Test(priority=1)
	public void Verify_Loginpage_Closebutton() throws InterruptedException
	{	 
	    l.clickonloginbutton();
	    t.waits();
	    l.clickonclosebutton();
	    t.waits();
	    driver.navigate().refresh();
		t.waits();
	}


	@Test(priority=2)
	public void Verify_Loginpage_Without_UsernamePassword()
	{
		l.clickonloginbutton();
		l.clickonlogin();
		t.alertdismiss();
		 t.waits();
	}
	
	@Test(priority=3)
	public void Verify_Loginpage_Without_Password()
	{
		l.enterusername(loginUsers.getJSONObject("Loginpage_Without_Password").getString("Username"));
		l.clickonlogin();
		t.alertdismiss();
		l.Clearusername();
	}
	
	@Test(priority=4)
	public void Verify_Loginpage_Without_Username()
	{
		l.enterpassword(loginUsers.getJSONObject("Loginpage_Without_Username").getString("Password"));
		l.clickonlogin();
		t.alertdismiss();
		l.Clearpassword();
	}
	
	@Test(priority=5)
	public void Verify_Loginpage_With_UsernamePassword_notexist()
	{
		l.enterusername(loginUsers.getJSONObject("Loginpage_With_UsernamePassword_notexist").getString("Username"));
		l.enterpassword(loginUsers.getJSONObject("Loginpage_With_UsernamePassword_notexist").getString("Password"));
		l.clickonlogin();
		t.alertdismiss();
		l.Clearusername();
		l.Clearpassword();
	}
	
	@Test(priority=6)
	public void Verify_Loginpage_With_UsernamePassword()
	{
		t.waits();
		l.enterusername(loginUsers.getJSONObject("Loginpage_With_UsernamePassword").getString("Username"));
		l.enterpassword(loginUsers.getJSONObject("Loginpage_With_UsernamePassword").getString("Password"));
		l.clickonlogin();	
	}
	

}
