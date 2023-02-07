package orangrHrm.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import orangrHrm.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws InterruptedException 
	{


		driver.get(baseURL);
		logger.info("url is opened");
		LoginPage lp=new LoginPage(driver);


		lp.setUserName(username);
		logger.info(" entered user name");

		lp.setpassword(password);
		logger.info("Entered password");


		lp.submit();
		logger.info("click on submitted");

		if(driver.getTitle().equalsIgnoreCase("OrangeHrm"))
		{
			Assert.assertTrue(true); 
			logger.info("Login test passed");
		}
		else
		{
			Assert.assertFalse(false);
			logger.info("Login test failed");
		}
	}
}