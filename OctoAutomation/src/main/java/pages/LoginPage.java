package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td[2]/input")
	public WebElement userIdTxtBox;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td[2]/input")
	WebElement passwordTxtBox;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	public WebElement loginBtn;
	
	
	public void setUserId(String userId)
	{
		sendText(userIdTxtBox, userId);
	}
	
	public void setPassword(String password)
	{
		sendText(passwordTxtBox, password);
	}
	
	public void ClickOnLoginBtn() 
	{	
		loginBtn.click();
	}

}
