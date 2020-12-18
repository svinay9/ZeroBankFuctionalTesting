package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TransferfundsPage {
	
	public TransferfundsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@id='transfer_funds_tab']")
	public WebElement transferfunds;
	@FindBy(xpath = "//select[@id='tf_fromAccountId']")
	public WebElement frmaccount;
	@FindBy(name = "toAccountId")
	public WebElement toaccnt;
	@FindBy(id = "tf_amount")
	public WebElement amnt;
	@FindBy(id = "tf_description")
	public WebElement dscrptn;
	@FindBy(xpath = "//button[@id='btn_submit']")
	public WebElement contnue;
	@FindBy(xpath  ="//button[@id='btn_submit']")
	public WebElement fnlsbmt;
	
	@FindBy(xpath = "//h2[contains(text(),'Transfer Money & Make Payments - Confirm')]")
	public WebElement ActualMsg;
	
	public void fundstransfer() {
		transferfunds.click();
		Select ddfromaccount = new Select(frmaccount);
		ddfromaccount.selectByIndex(0);
		Select ddtoaccount = new Select(toaccnt);
		ddtoaccount.selectByIndex(3);
		amnt.sendKeys("50");
		dscrptn.sendKeys("checking Transfer to account");
		contnue.click();
		fnlsbmt.click();
		String xpectedmsg = "Transfer Money & Make Payments - Confirm";
		String MsgActual = ActualMsg.getText();
		Assert.assertEquals(MsgActual, xpectedmsg);
		
	}
	


}
