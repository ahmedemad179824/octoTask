package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {


	protected WebDriver driver;

	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void sendText(WebElement element, String text )
	{
		element.clear();
		element.sendKeys(text);
	}
	
}
