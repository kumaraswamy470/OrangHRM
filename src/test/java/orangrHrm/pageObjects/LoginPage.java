package orangrHrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	 public  LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//input[@name='username']")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	@CacheLookup
	WebElement btnLogin;
	
	public void setUserName(String uname) {
		
		txtUserName.sendKeys(uname);
	}	
		
public void setpassword(String pwd) 
{
		
	txtPassword.sendKeys(pwd);
	}		
		
	public void submit() 
	{
		btnLogin.click();
	}
		
		
		
		
		
		
		
	
}
