package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import main.MainPage;


public class AddpayeePage extends MainPage{
	
	public AddpayeePage(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(linkText = "Pay Bills")
	public WebElement paybill;
	
	@FindBy(xpath = "//a[contains(text(),'Add New Payee')]")
    public WebElement addnewpaye;
	
	@FindBy(id = "np_new_payee_name")
	public WebElement newpayename;
	
	@FindBy(id = "np_new_payee_address")
	public WebElement newpayeeaddrs;
	
	@FindBy(id = "np_new_payee_account")
	public WebElement newpayeeaccnt;
	
	@FindBy(id = "np_new_payee_details")
	public WebElement newpayeedetail;
	
	@FindBy(xpath = "//input[@id='add_new_payee']")
	public WebElement addbtn;
	
	@FindBy(css = "#alert_content")
	public WebElement AlertMsg;
	
	public void  payeeadd(String payeename, String payeeaddr, String payeeaccnt, String payeedetail) throws IOException {
		paybill.click();
		addnewpaye.click();
		newpayename.sendKeys(payeename);
		newpayeeaddrs.sendKeys(payeeaddr);
		newpayeeaccnt.sendKeys(payeeaccnt);
		newpayeedetail.sendKeys(payeedetail);
		addbtn.click();
		boolean MsgActual = AlertMsg.isDisplayed();
		//String xpectedmsg ="The new payee cbdcbdj was successfully created." ;
		//Assert.assertEquals(MsgActual, xpectedmsg);
		//assertTrue*()
		//String fail = "fail";
		//String pass= "pass";
		Assert.assertEquals(MsgActual, true);
		/*if (MsgActual	= false) {
			return pass;
		}
			else {
				return fail;
		}*/
		//if (MsgActual = true) {
			//Screencapture.capturescreen();
		//}
			
	}
	
}


