package web.demoblaze.testlayer;


import org.testng.annotations.Test;

import web.demoblaze.testbase.TestBase;

public class A_Registerpage_Test extends TestBase{
	
	@Test(priority=1)
	public void Verify_Signuppage_Closebutton() throws InterruptedException
	{
		t.waits();
		r.clickonsignupbutton();
		t.waits();
	    r.clickonclose_button();	
	    t.waits();
	    driver.navigate().refresh();
		t.waits();
	}
	
	@Test(priority=2)
	public void Verify_clickSignuppage_without_username_password() throws InterruptedException
	{
		t.waits();
		r.clickonsignupbutton();	
		t.waits();
	    r.clickonregisterbutton();	
	    t.alertdismiss();	
		t.waits();	
	}	
	
	  @Test(priority=3)
	  public void Verify_Signuppage_without_password() 
	  {
	  r.enterusername(loginUsers.getJSONObject("Signuppage_without_password"). getString("Username"));
	  t.waits();
	  r.clickonregisterbutton();
	  t.alertdismiss(); 
	  r.clearusernamefiled();
	  }
	  
	  @Test(priority=4)
	  public void Verify_Signuppage_without_Username() 
	  {
	  r.enterpassword(loginUsers.getJSONObject("Signuppage_without_Username").getString("Password")); 
	  r.clickonregisterbutton();
	  t.alertdismiss();
	  r.clearPasswordfiled();
	  }

	  @Test(priority=5) 
	  public void Verify_Signuppage_with_Username_Password_Already_Exit()
	  {
	  r.enterusername(loginUsers.getJSONObject("Signuppage_with_Username_Password_Already_Exit").getString("Username"));
	  r.enterpassword(loginUsers.getJSONObject("Signuppage_with_Username_Password_Already_Exit").getString("Password"));
	  r.clickonregisterbutton();	
	  t.alertdismiss();
	  r.clearusernamefiled();
	  r.clearPasswordfiled();	  
	  }
	 
	  @Test(priority=6) 
	  public void Verify_Signuppage_with_Username_Password()
	  {
	  r.enterusername(loginUsers.getJSONObject("Signuppage_with_Username_Password").getString("Username"));
	  r.enterpassword(loginUsers.getJSONObject("Signuppage_with_Username_Password").getString("Password"));
	  r.clickonregisterbutton();	
	  t.alertdismiss(); 
	  }
	
	
	
	
	
	
	
	
	

}
