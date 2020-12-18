package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import main.MainPage;

public class signout extends MainPage{

	public signout(WebDriver driver) {
		super(driver);
		}
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	public WebElement sinout;
	@FindBy(xpath = "//a[@id='logout_link']")
	public WebElement logot;
	public void logout() {
	sinout.click();
	logot.click();

}
}
