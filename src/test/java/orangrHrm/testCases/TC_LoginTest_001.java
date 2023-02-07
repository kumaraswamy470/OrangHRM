package orangrHrm.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import orangrHrm.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws InterruptedException 
	{
		Thread.sleep(5000);
	
		driver.get(baseURL);
	logger.info("url is opened");
	LoginPage lp=new LoginPage(driver);
	
	Thread.sleep(10000);
	lp.setUserName(username);
	logger.info(" entered user name");
	Thread.sleep(10000);
	lp.setpassword(password);
	logger.info("Entered password");
	Thread.sleep(10000);
	
    lp.submit();
    logger.info("click on submitted");
    Thread.sleep(10000);
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