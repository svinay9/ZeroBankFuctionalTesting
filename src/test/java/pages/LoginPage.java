package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.MainPage;

public class LoginPage extends MainPage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		}
	@FindBy(id="user_login")
	public WebElement username;
	
	@FindBy(id="user_password")
	public WebElement password;		
	
	@FindBy(name="submit")
	public WebElement submitBtn;
	
	public void dologin(String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		submitBtn.click();
		
	
	}


}
