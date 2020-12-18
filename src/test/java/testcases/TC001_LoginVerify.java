package testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import main.MainClass;
import pages.HomePage;
import pages.LoginPage;







public class TC001_LoginVerify extends MainClass {
	
	
	@Test
	public void verifyLogin() throws InterruptedException{
		
		
		LoginPage lp ;
		HomePage hp;
		//Below is for extent report
				test.log(LogStatus.INFO, "Login Test started");
				//Below is for log4j logs
				app_logs.info("verify login test started");
				hp = new HomePage(driver);
				test.log(LogStatus.INFO, "Clicked Signin button");
				hp.clicksigninbtn();;
				lp=new LoginPage(driver);
				test.log(LogStatus.INFO, "Entered Username and Password");
				lp.dologin("username", "password1");
				String actual = driver.getTitle();
				String expected="Zero - Account Summary";
				Assert.assertEquals(actual, expected);
				app_logs.info("verify login test completed");
				test.log(LogStatus.INFO, "verify Login Test completed");
				
	
	}
	
}
