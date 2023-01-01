package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerDataPage extends PageBase {

	public CustomerDataPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"customer\"]/tbody/tr[1]/td/p")
	public WebElement successMessageField;
	
	@FindBy(css = "body > div:nth-child(6) > div > ul > li:nth-child(2) > a")
	public WebElement newCustomerBtn;

}
