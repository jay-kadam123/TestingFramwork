package web.demoblaze.testlayer;

import org.testng.annotations.Test;

import web.demoblaze.testbase.TestBase;

public class C_CartpageTest extends TestBase{
	
	@Test(priority=1)
	public void addToCartProduct()
	{
		t.waits();
		t.Scrolldown();
		c.clickonproduct();
		c.clickonaddtocartbutton();
		t.alertdismiss();
		c.clickoncartbutton();
		c.clickonPlaceorderbutton();
		c.enternametextbar(props.getProperty("Name"));
		c.entercountrytextbar(props.getProperty("Country"));
		c.entercitytextbarr(props.getProperty("City"));
		c.entercardtextbar(props.getProperty("Creditcard"));
		c.entermonthtextbar(props.getProperty("Month"));
		c.enteryeartextbar(props.getProperty("Year"));
		c.clickonPurchase();
		c.clickonokbutton();
		
		
	}

}
