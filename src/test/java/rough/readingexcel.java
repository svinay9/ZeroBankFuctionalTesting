package rough;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import main.MainClass;
import pages.HomePage;
import pages.LoginPage;
import utilities.excelreaddatamethod;

public class readingexcel extends MainClass {
	@Test
	public void verifyLogin1() throws InterruptedException, IOException{
		
		
		LoginPage lp ;
		HomePage hp;
		signout st ;
		st = new signout(driver);
		String[][] data = excelreaddatamethod.getData("C:\\Users\\Vinay\\Desktop\\Testdata.xlsx", "Sheet1");
		//Below is for extent report
				test.log(LogStatus.INFO, "Login Test started");
				//Below is for log4j logs
				app_logs.info("verify login test started");
				hp = new HomePage(driver);
				test.log(LogStatus.INFO, "Clicked Signin button");
				hp.clicksigninbtn();;
				lp=new LoginPage(driver);
				test.log(LogStatus.INFO, "Entered Username and Password");
				for(int i = 1;i<data.length;i++) {
				lp.dologin(data[i][0],data[i][1]);
				String actual = driver.getTitle();
				String expected="Zero - Account Summary";
				
				
				//Assert.assertEquals(actual, expected);
				if (driver.getTitle().equalsIgnoreCase(expected)) {
					System.out.println("Login Success");
				st.logout();
				hp.clicksigninbtn();
				}
				System.out.println(i);
				//}
				//app_logs.info("verify login test completed");
				//test.log(LogStatus.INFO, "verify Login Test completed");
				
	
	}
	
	}
}


