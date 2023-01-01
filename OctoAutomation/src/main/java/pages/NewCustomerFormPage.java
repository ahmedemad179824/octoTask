package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerFormPage extends PageBase{

	public NewCustomerFormPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0")
	public WebElement frame1;
	
	@FindBy(id="dismiss-button")
	public WebElement closeBtnAds;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[3]")
	public WebElement adsCloseBtn;

	@FindBy (css = "body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]")
	public WebElement customerNameTxtBox;

	@FindBy (css = "body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(2)")
	public WebElement genderRadioBtn;

	@FindBy (id = "dob")
	public WebElement dateOfBirthTxtBox;

	@FindBy (css = "body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea")
	public WebElement addressTxtBox;

	@FindBy (css = "body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]")
	public WebElement cityTxtBox;

	@FindBy (css = "body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]")
	public WebElement stateTxtBox;

	@FindBy (css = "body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]")
	public WebElement pinTxtBox;

	@FindBy (css = "body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]")
	public WebElement mobileNumberTxtBox;

	@FindBy (css = "body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]")
	public WebElement emailTxtBox;

	@FindBy (css = "body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]")
	public WebElement passwordTxtBox;

	@FindBy (css = "body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)")
	public WebElement submitBtn;
	
	
	public void clickOnCloseBtn() 
	{
		adsCloseBtn.click();
	}

	public void setCustomerName(String name) 
	{
		sendText(customerNameTxtBox, name);
	}
	
	public void setCustomerGender() 
	{
		genderRadioBtn.click();
	}
	
	public void setCustomerDateofBirth(String date) 
	{
		sendText(dateOfBirthTxtBox, date);
	}
	
	
	public void setCustomerAddress(String address)
	{
		sendText(addressTxtBox, address);
	}
	
	public void setCustomerCity(String city) 
	{
		sendText(cityTxtBox, city);
	}
	
	public void setCustomerState(String state) 
	{
		sendText(stateTxtBox, state);
	}
	
	public void setCustomerPin(String pin) 
	{
		sendText(pinTxtBox, pin);
	}
	
	public void setCustomerMobileNumber(String number) 
	{
		sendText(mobileNumberTxtBox, number);
	}
	
	public void setCustomerEmail(String email)
	{
		sendText(emailTxtBox, email);
	}
	
	public void setCustomerPassword(String password)
	{
		sendText(passwordTxtBox, password);
	}
	
	public void clickOnSubmitBtn()
	{
		submitBtn.click();
	}

}
