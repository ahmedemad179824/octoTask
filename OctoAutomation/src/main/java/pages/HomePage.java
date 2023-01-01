package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath = "/html/body/div[3]/div/ul/li[2]/a")
	public WebElement newCustomerBtn;
	
	@FindBy (css = "tr.heading3")
	public WebElement mangerId;
	
	
	public void ClickOnNewCustomerBtn()
	{	
		newCustomerBtn.click();
	}

}
