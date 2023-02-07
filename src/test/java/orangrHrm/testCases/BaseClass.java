package orangrHrm.testCases;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public String baseURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public String username="Admin";
	public String password="admin123";
	public static WebDriver driver;
	public static Logger logger;
	@BeforeClass
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		logger=Logger.getLogger("orangeHrm");
		PropertyConfigurator.configure("log4j.properties");
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	

}
	

