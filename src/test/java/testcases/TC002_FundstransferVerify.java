package testcases;

import org.testng.annotations.Test;


import main.MainClass;

import pages.TransferfundsPage;

public class TC002_FundstransferVerify extends MainClass{
	
	@Test
	public void verifyfundstransfer() {
		//LoginPage lp;
		//HomePage hp ;
		TransferfundsPage tp;
		
		//hp = new HomePage(driver);
		//hp.clicksigninbtn();
		//lp = new LoginPage(driver);
		//lp.dologin("username", "password");
		tp = new TransferfundsPage(driver);
		tp.fundstransfer();
	}
	
	

}
