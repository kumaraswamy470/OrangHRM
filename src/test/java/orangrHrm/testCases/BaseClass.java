package orangrHrm.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	//public String baseURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public String username="Admin";
	public String password="admin123";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		//System.setProperty("webdriver.chrome.driver","E:\\selenium\\orangrHrm\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	

}
	

