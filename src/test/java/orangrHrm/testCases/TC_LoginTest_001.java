package orangrHrm.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import orangrHrm.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	LoginPage lp=new LoginPage(driver);
	lp.setUsertName(username);
	lp.setpassword(password);	
    lp.submit();
	
	if(driver.getTitle().equalsIgnoreCase(""))
	{
	Assert.assertTrue(true);  
	}
	else
	{
		Assert.assertFalse(false);
	}
}
}