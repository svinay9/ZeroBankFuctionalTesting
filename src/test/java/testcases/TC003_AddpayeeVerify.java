package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import main.MainClass;
import pages.AddpayeePage;

import pages.LoginPage;


public class TC003_AddpayeeVerify extends MainClass {
	
	@Test
	public void verifyAddpayee() throws IOException {
	LoginPage lp ;

	AddpayeePage ap;
	lp = new LoginPage(driver);
	//hp = new HomePage(driver);
	ap = new AddpayeePage(driver);
	String expected = "Zero - Log in";
	test.log(LogStatus.INFO, "add Payee Test started");
	app_logs.info("add Payee test started");
	//hp.clicksigninbtn();
	test.log(LogStatus.INFO, "Entered Username and Password");
	if (driver.getTitle().equalsIgnoreCase(expected)){
	lp.dologin("username", "password");
	}
	test.log(LogStatus.INFO, "Clicked PayBills button");
	test.log(LogStatus.INFO, "Entered information in the new Payee form");
	ap.payeeadd("enercare", "189 east avenue", "99999999", "Gas company Bill");
	Assert.assertTrue(ap.AlertMsg.isDisplayed());
	app_logs.info("add Payee test completed");
	test.log(LogStatus.INFO, "Add Payee test completed");
	/*String Chk ="fail";
	String res = ap.payeeadd();
	if (res.matches(Chk)){
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Vinay\\Desktop\\capturescreen.jpg"));
		driver.quit();
	}*/
}
}