package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.MainPage;

public class HomePage extends MainPage {
	
	public HomePage(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(id="signin_button")
	public WebElement sgnbtn;
	
	public void clicksigninbtn() {
		sgnbtn.click();

}
}