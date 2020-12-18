package rough;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;






public class testinglogs  {

	WebDriver driver;
	public Logger log=LogManager.getLogger(testinglogs.class.getName());
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
	@Test
	public void verifyTitle() {
		log.info("verifyTitle test started check1");
		String actualTitle=driver.getTitle();
		String expectedTitle = "My Store";
		Assert.assertEquals(actualTitle, expectedTitle, "Title of home page");
		System.out.println(actualTitle);
		log.info("verifyTitle test completed");
		
	
	}
	
	
	@AfterMethod
	public void tearDon() {
		driver.quit();
		
	}
}
